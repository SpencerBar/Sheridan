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
            destinationStart = int(categoryList[categoryLine][0]) ## this may be the problem
            sourceStart= int(categoryList[categoryLine][1])
            lineRange = int(categoryList[categoryLine][2])
            sourceEnd = sourceStart+lineRange
            
            if int(seedList[seed])>=sourceStart and int(seedList[seed])<= sourceEnd:
                if lowestPerSeed[seed] == -1:
                    lowestPerSeed[seed] =  int(seedList[seed]) - sourceStart
                elif lowestPerSeed[seed] > int(seedList[seed])- sourceStart:
                        lowestPerSeed[seed] =  int(seedList[seed]) - sourceStart
            else:
                if lowestPerSeed[seed] == -1:
                        lowestPerSeed[seed] = int(seedList[seed])
                elif lowestPerSeed[seed] > int(seedList[seed]):
                        lowestPerSeed[seed] = int(seedList[seed])
    ## need to leave it -1 and then make a check to see if it translates instead. that should fix the problem
    for difference in range(len(lowestPerSeed)):
            if lowestPerSeed[difference] == int(seedList[difference]):
                newLocation.append(int(seedList[difference]))
            else:
                newLocation.append(int(lowestPerSeed[difference]+destinationStart))
    return newLocation   
    
#something in one of these two functions isnt operating correctly
def doAllCategories(fileSorted):
    newLocation = fileSorted[0]
    for categories in range(2, len(fileSorted)):
        newLocation = getCategoryLocationDiff(newLocation,fileSorted[categories])
        tempLocation = -1
    for locations in newLocation:
        
        if tempLocation == -1:
            tempLocation = int(locations)
        else:
            if tempLocation > int(locations):
                tempLocation = int(locations)
    print(tempLocation)


main()
