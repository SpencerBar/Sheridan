

class Car:
    _total_ = 0

    def __init__(self,make,model,price = 0):
        self.__make = make
        self.__model = model
        self.__price = price
        Car._total_ += 1


    def setPrice(self, price):
        self.__price = price
    def getPrice(self):
        return self.__price
    def getModel(self):
        return self.__model
    def getMake(self):
        return self.__make
    def __str__(self):
        return f'Price:{self.__price}, Model:{self.__model} Make:{self.__make}'
    
    @classmethod
    def getTotal():
        return Car._total_
    

class Customer:
 
    def __init__(self, name,address = "Unknown Address", cars_owned = []):
        self.__name = name
        self.__address = address
        self.__carsOwned = cars_owned
        

    def setName(self):
        name = input("enter the Name:")
        try:
            if name.isnumeric:
                self.__name = name
        except:
            self.setName()

    def getName(self):
        return self.__name
    def getAddress(self):
        return self.__address
    def setAddress(self):
        address = input("enter the Name:")
        try:
            if type(address) == type(str) :
                self.__address = address
        except:
            self.setAddress()

    def addCar(self,car):
        self.__carsOwned.append[car]
    
    def removeCar(self, car):
        self.__carsOwned.remove(car)
    def __str__(self):
        cars = ''
        for i in self.__carsOwned:
            cars +f'{i}\n'
        return f'Name: {self.__name}\nAddress: {self.__address}\nCars Owned:\n{cars}'

class Dealership:
    def __init__(self,cars = [],customers = []):
        self.__carList = cars
        self.__customerList = customers

    def getCustomers(self):
        return self.__customerList
    def getCars(self):
        return self.__carList
    
    def addCars(self, car):
        self.__carList.append(car)

    def addCustomers(self, customer):
        self.__customerList.append(customer)

    def __str__(self):
        car = ''
        for i in self.__carList:
            car.append(f'{i}\n')
        customer = ''
        for i in self.__customerList:
            customer.append(f'{i}\n')
        return f'Cars:\n{car}\nCustomers:{customer}'

