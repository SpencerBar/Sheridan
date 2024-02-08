import boto3
import time

# finds and returns single subnet id from the given availability zone
def retrieveSubId(regionName, availZone):
   
    ec2Client = boto3.client('ec2',region_name = regionName)

    response = ec2Client.describe_subnets(
        Filters=[
            {
                'Name': 'availabilityZone',
                'Values':[availZone]
            }
        ]
    )
    return response['Subnets'][0]['SubnetId']
     




#create volume and attatch it
def create_volume(regionName, availZone, instanceId):
    ec2Resource = boto3.resource('ec2',region_name = regionName)
    ec2Client = boto3.client('ec2', region_name=regionName)
# create volume
    ebsVolume = ec2Resource.create_volume(
        AvailabilityZone=availZone,
        Size=8,
        VolumeType='gp2'
    )

    print("waiting for volume to boot")
    while True:
        volume = ec2Client.describe_volumes(VolumeIds=[ebsVolume.id])
        volumeState = volume['Volumes'][0].get('State', None)
        if volumeState == 'available':
            break
        time.sleep(5)
    
    ebsVolume.attach_to_instance(
        Device='/dev/sdf',
        InstanceId=instanceId,
    )



#create instance
def createAssignmentInstance(regionName, availZone):

    subnet =retrieveSubId(regionName , availZone)
    ec2Client = boto3.client('ec2', region_name = regionName)
    
    userData ='''#!/bin/bash
yum install httpd -y
var=$(curl -s http://169.254.169.254/latest/meta-data/placement/availability-zone)
echo "<html><body><h1> Hello From Spencer Barnes </h1></body></html>" > /var/www/html/index.html
systemctl restart httpd
systemctl enable httpd'''

    instances = ec2Client.run_instances(
        ImageId='ami-0e731c8a588258d0d', 
        MinCount=1,
        MaxCount=1,
        InstanceType='t2.micro',
        KeyName='vockey',
        SecurityGroupIds=['sg-0b6ac37870bc43cf0'],
        SubnetId=subnet,
        UserData=userData
    )

    instanceId = instances['Instances'][0]['InstanceId']
    print(f"Instance id is {instanceId}")
    ec2Resource = boto3.resource('ec2', region_name=regionName)
    instance = ec2Resource.Instance(instanceId)


    print(f"waiting for instance {instanceId} to boot")
    instance.wait_until_running()
    
    create_volume(regionName, availZone, instanceId)


createAssignmentInstance("us-east-1","us-east-1d")

