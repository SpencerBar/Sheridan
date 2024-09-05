class Product():
    def __init__(self, name, qty = 0, price = 0):
        self.__name = name
        self.__qty = qty
        self.__price = price
        self.__pricePer = price/qty

    def getName(self):
        return self.__name
    
    def setName(self, name):
        self.__name = name
    
    def getQty(self):
        return self.__qty
    def setQty(self, qty):
        self.__qty = qty
    def getPrice(self):
        return self.__price
    def setPrice(self, price):
        self.__price = price
    def getPricePer(self):
        return self.__pricePer
    def calcTotal(self, num):
        return num * self.__pricePer
    
    def __str__(self):
        return (f'Name: {self.__name}\nQty:{self.__qty}\nTotal Price:{self.__price}'
                f'Price Per:{self.__pricePer}')