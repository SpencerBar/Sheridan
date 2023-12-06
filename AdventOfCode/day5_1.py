def main():
    doAllCategories(fileSort())
    doAllCategoriesRange(fileSortSeedlist())

   
def fileSort():
    lineList = []
    categoryList = []
    with open("day5_1.txt", 'r') as seedList:
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
    lineList.append(categoryList)  
    return lineList

def fileSortSeedlist():
    lineList = []
    categoryList = []
    seedRangeList = []
    with open("day5_1_1.txt", 'r') as seedList:
      for line in seedList:
        if lineList == []:
            seedTemp = line.split(':')
            seedTemp = seedTemp[1].strip('\n')
            seedTemp= seedTemp.split()
            for seed in range(0,len(seedTemp),2):
                seedRange = [seedTemp[seed],seedTemp[seed+1]]
                seedRangeList.append(seedRange)
            lineList.append(seedRangeList)
        elif line == "\n":
           lineList.append(categoryList)
           categoryList = []
        elif categoryList == []:
           categoryList.append(line.strip('\n'))
        else:
           categoryTemp = line.strip('\n')
           categoryList.append(categoryTemp.split())
    lineList.append(categoryList)  
    return lineList

def getCategoryLocationDiff(seedList, categoryList):
    lowestPerSeed = []
    
   
    print(categoryList[0])
    for seed in range(len(seedList)):
        lowestPerSeed.append(-1)
        
        for categoryLine in range(1,len(categoryList)): 
            destinationStart = int(categoryList[categoryLine][0]) ## this may be the problem
            sourceStart= int(categoryList[categoryLine][1])
            lineRange = int(categoryList[categoryLine][2])
            sourceEnd = sourceStart+lineRange - 1
            
            
            if  int(seedList[seed])<=sourceStart and  int(seedList[seed])>= sourceEnd:
                continue
            elif int(seedList[seed])>=sourceStart and  int(seedList[seed])<= sourceEnd:
                if lowestPerSeed[seed] == -1:
                    lowestPerSeed[seed] =  ((int(seedList[seed])) - sourceStart) + destinationStart
                else:
                    if lowestPerSeed[seed] > ((int(seedList[seed])) - sourceStart) + destinationStart :
                        lowestPerSeed[seed] =  ((int(seedList[seed])) - sourceStart) + destinationStart
    for location in range(len(lowestPerSeed)):
        if lowestPerSeed[location] == -1:
            lowestPerSeed[location] = int(seedList[location])
        else:
            continue

    
             
    return lowestPerSeed   
    

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

def getSeedList(seedRangeList, categoryList):
  
  for category in range(2,len(categoryList)):
        print(categoryList[0])
        lowestSeedList = []
        for seedRangeIndex in range(len(seedRangeList)):
            seedStart = int(seedRangeList[seedRangeIndex][0])
            seedRange = int(seedRangeList[seedRangeIndex][1])
            seedEnd = seedStart + seedRange -1
            for lines in categoryList:
                if lines == categoryList[0]:
                    continue
                categoryStart = int(lines[1])
                categoryEnd = categoryStart + int(lines[2]) - 1
                for listRange in range(seedStart, seedEnd,10000):
                    if listRange >= categoryStart and listRange <= categoryEnd:
                        for smallerList in range(listRange,listRange+10000,500):
                            if smallerList >= categoryStart and smallerList <= categoryEnd:
                                seedMatch = set(range(smallerList, smallerList+499))
                                seedMatch = seedMatch.intersection(set(range(categoryStart,categoryEnd-1)))
                                lowestSeedList.append(seedMatch)
        return lowestSeedList

        
            
        
   


def doAllCategoriesRange(fileSorted):
    newLocation = fileSorted[0] 
    newLocation = getSeedList(newLocation,fileSorted[2])
    return

    
    print(newLocation)
main()
