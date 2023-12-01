# PART 1
runTot = 0
num1 = 0
num2 = 0
index = 0

with open("day1_1.txt", "r") as keytext:
    #loop through each line
    for line in keytext:
       #creating a place to store numbers in each line
        tempIndex=[]
        #loop through each index location of line
        for i in range(len(line)):
            #check if number
            if line[i].isnumeric():
                #add the value to the index
                tempIndex.append(line[i])
                #iterate the index
                index +=1
        if index <=1 and index >=0:
            lineTot = int(str(tempIndex[0])+str(tempIndex[0]))
        else:
            num1, num2 = tempIndex[0],tempIndex[index-1]
            lineTot = (int(str(num1) + str(num2)))
        index = 0
        runTot += int(lineTot)
        num1, num2 = 0, 0     
print(runTot)


    