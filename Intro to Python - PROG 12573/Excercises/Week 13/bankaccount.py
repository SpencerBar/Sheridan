from datetime import date
class Account:
    _accountID_ = 0
    _annualInterestRate_ = 0
    def __init__(self, balance = 0):
        self.__ID = Account._accountID_
        Account._accountID_ +=1
        self.__balance = balance
        self.__dateMade = date
        self.__anInR = Account._annualInterestRate_
    def getID(self):
        return self.__ID
    def getBalance(self):
        return self.__balance
    def getInterestRate(self):
        return self.__anInR
    def getDateCreated(self):
        return self.__dateMade
    
    def setBalance(self):
        balance = input("Enter a balance")
        try:
            if balance >= 0:
                self.__balance = balance
            else:    
                print("Balance cannot be negative")
                self.setBalance()
        except Exception as err:
            print(err)
            self.setBalance()
            
    def setAnnualInterest(self, interest):
        self.__anInR = interest
    def __getMonthlyIntRate(self):
        return
    def getMonthlyInt(self):
        monthlyInt = self.__balance * self.__getMonthlyIntRate()
    def withdraw(self):
        amount = input('Enter an amount: ')
        try:
            if amount <= self.__balance:
                self.__balance -= amount
            else:
                self.withdraw()
        except Exception as err:
            print(err)
            self.withdraw()
        
    def deposit(self):
        amount = input('Enter an amount: ')
        try:
            if amount >=0:
                self.__balance += amount
            else:
                self.deposit()
        except Exception as err:
            print(err)
            self.deposit()