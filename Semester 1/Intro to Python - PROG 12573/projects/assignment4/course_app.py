# SpencerBarnesAssignment4.py
# Author: Spencer Barnes
# Date: December 1st 2023 (12/01/2023)
#
#
#
# A program that creates Course obejcts and displays them
#

#imports course module
import course
#main function
def main():
    #calls createCourse()
    course1 = createCourse()
    #calls printCourse to print the course object
    printCouse(course1)

#getting inputs course Code
def getCode():
    return input(f"Enter course code:{'':14}")

#gets course name
def getName():
    return input(f"Enter the course name:{'':10}")

#gets number of students
def getStudentNum():
    #loops until tempNum is the right type of number
    while True:
        #get input
        tempNum = input(f"Enter the number of students:{'':3}")
        #try to convert tempNum to int
        try:
            tempNum = int(tempNum)
            #if that in is greater than zero carry on
            if tempNum > 0:
                return tempNum
            #if not raise value error
            else:
                raise ValueError(
                    'Error: Number of students must be positive!')
        #general catchall error for incorrect inputs 
        except Exception as err:
            print(err)
        
               
#Gets tuition fee
def getTuitionFee():
        
        while True:
            tempNum = input(f"Enter the tuition fee:{'':10}")
            try:
                tempNum = float(tempNum)
                if tempNum > 0:
                    return tempNum
                else:
                    raise ValueError('Error: Tuition fee must be positive!') 
            except Exception as err:
                print (err)
           
                   
#cleanly creates courses          
def createCourse():
    tempCode = getCode()
    tempName = getName()
    tempStudNum = getStudentNum()
    tempTuition = getTuitionFee()
    return course.Course(tempCode,tempName,tempStudNum,tempTuition)

#handles printing 
def printCouse(course):
    print(f'---------------------------------------------------------')
    print(f'Course Code{"":3}Course Name{"":3}Students{"":3}Fee{"":4}Total')
    print(f'---------------------------------------------------------')
    print(course)

#making sure file is main
if __name__ == "__main__":
    main()
