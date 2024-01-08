import math
def getRadius() -> float:
    radius = float(input("Enter the radius: "))
    return radius

def getArea(radius) -> float:
    area = math.pi *  math.exp2(radius)
    return area

def getCircum(radius) -> float:
    circum = (2 * math.pi * radius)
    return circum


def printArea(area):
    print(f'The area of the given cirlce is {area}')

def printCircum(circum):
    print(f'The circumference of thge given circle is {circum}')

def getAreaCircum():
    radius = getRadius()
    area = getArea(radius)
    circum = getCircum(radius)
    printArea(area)
    printCircum(circum)