from datetime import date
class Account:
    _accountID_ = 0
    def __init__(self, balance = 0, annualInterest = .01):
        self.__ID = Account._accountID_
        Account._accountID_ +=1
        self.__balance = balance
        self.__dateMade = date
        self.__anInR = annualInterest
    def getID(self):
        return self.__ID
    def getBalance(self):
        return self.__balance
    def getInterestRate(self):
        return self.__anInR
    def getDateCreated(self):
        return self.__dateMade
    
    def setBalance(self, balance):
        self.__balance = balance
    def setAnnualInterest(self, interest):
        self.__anInR = interest
    def getMonthlyIntRate(self):
        return
    def getMonthlyInt(self):
        return
    def withdraw(self,amount):
        self.__balance -= amount
        
    def deposit(self, amount):
        self.__balance += amount