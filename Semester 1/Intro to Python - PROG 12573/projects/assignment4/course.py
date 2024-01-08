# SpencerBarnesAssignment4.py
# Author: Spencer Barnes
# Date: December 1st 2023 (12/01/2023)
#
#
#
#A module that contains the Course class, which has
#several methods in it to initialize, get and set values
# as well as a custom __str__ method
#

class Course():
    #initializes given values
    def __init__(
            self,
            courseCode,
            courseName,
            numOfStudents = 0,
            tuitionFee = 0):
        
        #sets course code and course name to private variables
        self.__courseCode = courseCode
        self.__courseName = courseName
        try:
            #checks if value entered is less than 0
            if numOfStudents < 0:
                raise ValueError('Number of students cannot be less than 0')
            self.__numOfStudents = numOfStudents
        except Exception as err:
            print(err)
            return
        try:
            #checks if value entered was less that 0
            if tuitionFee < 0:
                raise ValueError('Tuition  cannot be less than 0')  
            self.__tuitionFee = tuitionFee
        #general exception for input errors etc
        except Exception as err:
            print(err)
            return
        #creates tuition total immediately if values previously are accepted   
        self.__tuitionTotal = self.__tuitionFee * self.__numOfStudents


    #getter for __courseCode
    def getCourseCode(self):
        return self.__courseCode
    
    #setter for __courseCode
    def setCourseCode(self,courseCode):  
        self.__courseCode = courseCode
    
    #getter for __courseName
    def getCourseName(self):
        return self.__courseName
    
    #setter for __courseName
    def setCourseName(self,courseName):
        self.__courseName = courseName

    #getter for __numOfStudents
    def getNumStudents(self):
        return self.__numOfStudents
    
    #setter for __numOfStudents
    def setNumStudents(self,numOfStudents):
        try:
            if numOfStudents < 0:
                raise ValueError("Number of students cannot be less than 0")
            self.__numOfStudents = int(numOfStudents)
        except Exception as err:
            print(err)
            return
        update = self.tuitionTotal
    #getter for __tuitionFee
    def getTuitionFee(self,tuitionFee):
        return self.__tuitionFee
    
    #setter for __tuitionFee
    def setTuitionFee(self,tuitionFee):
        try:
            if tuitionFee < 0:
                raise ValueError('Tuition cannot be less than 0')
            self.__tuitionFee =float(tuitionFee)
            
        except Exception as err:
            print(err)
            return
        update = self.__tuitionTotal
    
    #Take the number of students and return the total tuition
    def tuitionTotal(self):
        self.__tuitionTotal = self.__tuitionFee * self.__numOfStudents
        return self.__tuitionTotal
    # __str__ method for function
    def __str__(self):
        return (f'{self.__courseCode:<14}'
                f'{self.__courseName:<16}'
                f'{self.__numOfStudents:<8}'
                f'{self.__tuitionFee:<8}'
                f'{self.__tuitionTotal:>}')