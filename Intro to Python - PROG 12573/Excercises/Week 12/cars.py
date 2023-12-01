class Car:

    def __init__(self, make, model, color = "null", kilo = 0):
        self.__make = make
        self.__model = model
        self.__kilo = kilo
        self.__color = color
        

    def setColor(self, color):
        self.__color = color
    def getColor(self):
        return self.__color
    def getModel(self):
        return self.__model
    def getMake(self):
        return self.__make
    def getKilo(self):
        return self.__kilo
       

    def setKM(self, kilo):
        if kilo > 0:
            self.kilo += kilo
            self.param[2] = self.kilo
        else:
            raise ValueError
    def __str__(self):
        return (f'Make:{self.make} Model:{self.model} Kilometers:{self.kilo} Color:{self.color}')

    def printSpec(self):
        print(f'Make:{"":20}{self.__make}\n'
                f'Model:{"":19}{self.__model}\n'
                f'Kilometers:{"":14}{self.__kilo:2f}\n'
                f'Color:{"":19}{self.__color}'
               )

