def main():
   doAllCategories(fileSort())

   
def fileSort():
    lineList = []
    categoryList = []
    with open("day5_1_1.txt", 'r') as seedList:
      for line in seedList:
        if lineList == []:
            seedTemp = line.split(':')
            seedTemp = seedTemp[1].strip('\n')
            lineList.append(seedTemp.split())
        elif line == "\n":
           lineList.append(categoryList)
           categoryList = []
        elif categoryList == []:
           categoryList.append(line.strip('\n'))
        else:
           categoryTemp = line.strip('\n')
           categoryList.append(categoryTemp.split())
           
    return lineList

def getCategoryLocationDiff(seedList, categoryList):
    lowestPerSeed = []
    newLocation = []
    print(categoryList[0])
    for seed in range(len(seedList)):
        lowestPerSeed.append(-1)
        for categoryLine in range(1,len(categoryList)):
            destinationStart = int(categoryList[categoryLine][0])
            sourceStart= int(categoryList[categoryLine][1])
            lineRange = int(categoryList[categoryLine][2])
             
            if int(seedList[seed])>sourceStart and int(seedList[seed])< sourceStart+lineRange:
               if lowestPerSeed[seed] == -1:
                  lowestPerSeed[seed] =  int(seedList[seed]) - sourceStart
               elif lowestPerSeed[seed] > int(seedList[seed])- sourceStart:
                    lowestPerSeed[seed] =  int(seedList[seed]) - sourceStart
            else:
               if lowestPerSeed[seed] == -1:
                  lowestPerSeed[seed] = int(seedList[seed])
               elif lowestPerSeed[seed] > int(seedList[seed]):
                  lowestPerSeed[seed] = int(seedList[seed])
    
    for difference in range(len(lowestPerSeed)):
            if lowestPerSeed[difference] == int(seedList[difference]):
                newLocation.append(seedList[difference])
            else:
                newLocation.append(lowestPerSeed[difference]+destinationStart)
    return newLocation   
    

def doAllCategories(fileSorted):
    newLocation = fileSorted[0]
    tempLocation = -1
    for categories in range(2,len(fileSorted)):
        newLocation = getCategoryLocationDiff(newLocation,fileSorted[categories])
    for locations in newLocation:
        if tempLocation == -1:
            tempLocation = locations
        else:
            if tempLocation > locations:
                tempLocation = locations
    print(tempLocation)


main()
