import math
class Fraction:
    def __init__(self, num = 0, den = 1):
        self.numerator = num
        self.denominator = den

    def setValue(self, num, denom):
        self.numerator = num
        self.denominator = denom

    def getValue(self):
        return self.numerator/self.denominator
    
    def inverse(self):
        self.numerator, self.denominator = self.denominator, self.numerator

class Rectangle:
    def __init__(self, length = 0, width = 0):
        self.width = width
        self.length = length
        self.area = width * length
        self.perimeter = (width + length) *2
        self.params = [self.width, self.length, self.area, self.perimeter, ]

    def __str__(self):
        return str(self.params)
        
    def getArea(self):
        return self.area
    def getPerimeter(self):
        return self.perimeter
    def getWidth(self):
        return self.width
    def getlength(self):
        return self.length
    
    def setArea(self, area):
        self.area = area
        self.params[2] = area
        
    def setPerimeter(self, perimeter):
       self.perimeter = perimeter
       self.params[3] = perimeter

    def setWidth(self, width):
        self.width = width
        self.params[0] = width

    def setlength(self, length):
        self.length = length
        self.params[1] = length
    
    
class Circle:
    def __init__(self, radius):
        self.radius = radius
        self.area = math.pi * self.radius ** 2
        self.circ = 2 * math.pi * self.radius
        self.params = {"Radius":self.radius, "Area":self.area, "Circumference":self.circ}

    def __str__(self):
        return str(self.params)
    
    def getArea(self):
        return self.area
    
    def getCirc(self):
        return self.circ


class Car:
    def __init__(self, make, model, kilo = 0, color = "null"):
        self.make = make
        self.model = model
        self.kilo = kilo
        self.color = color
        

    def setColor(self, color):
        self.color = color
       

    def setKM(self, kilo):
        self.kilo += kilo
        self.param[2] = self.kilo
    def __str__(self):
        return (f'Make:{self.make} Model:{self.model} Kilometers:{self.kilo} Color:{self.color}')

    
frac = Fraction(2, 3)
circ = Circle(3.5)
rect = Rectangle(2,3)
print(frac.getValue())
frac.inverse()
print(frac.getValue())
print(rect)
print(circ)