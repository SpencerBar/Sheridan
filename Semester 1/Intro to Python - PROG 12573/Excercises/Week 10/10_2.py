import random
# def main():
#         myList= [12,34,56]
#         addTo(myList, 67)
#         myDict = {'name' : "Alice", "age" : 30}
#         updateDict(myDict, "Location", "Toronto")
#         myString = "Hello"
#         myString = concString(myString, "World")
#         print(myString)
#         return


# def addTo(thislist, element):
#         thislist.append(element)
    

# def updateDict(thisDict, key, value):
#         thisDict[key] = value
        

# def concString(stringOne, stringTwo):
#         newString = stringOne + " " + stringTwo
#         return newString

# main()

def main():
    tuple1 = (1,4,4,2,5,-3,6,2)
    tuple2 = (2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79)
    linearSearch(tuple1, 4)
    binarySearch(tuple2, 3)
    list1 = rNG(99)
    list2 = bubbleSort(list1)
    print(list2)
    list3 = ["Alice", "Bob", "Eve", "Carol" ]
    list4 = descendingSort(list3)
    print(list4)


def linearSearch(object, value):
    index = -1
    for i in range(len(object)):
        if object[i]== value:
            index = i
    printResults(index, value)
            
        

def printResults(location, value):
    if location >=0:
        print(f"{value} is located at {location}")
    else:
        print(f'{value} not found in object!')

def binarySearch(object, value):
    index = -1
    low = 0
    high = len(object) - 1
    while high >= low:
        middle = (high + low) // 2
        if value == object[middle]:
            printResults(middle, value)
        elif value > object[middle]:
            low = middle + 1
        else:
            high = middle - 1
    printResults(index, value)

def rNG(length):
    randyList = [] 
    for i in range(length):
       randyList.append(random.randint(1,99))
    return randyList


def bubbleSort(object):
    tempList = list(object)
    objtype = type(object)
    for i in range(len(tempList)):
        for j in range(len(tempList) - 1 - i):
            if tempList[j] > tempList[j + 1]:
                tempList[j], tempList[j + 1] = tempList[j + 1], tempList[j]
    return objtype(tempList)

def descendingSort(object):
    return sorted(object, reverse = True)

if __name__ == "__main__":
    main()