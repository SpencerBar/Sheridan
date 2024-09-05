def main():
    engineArray = splitinput()
    goodNum = 0
    charIndex = searchLineForChar(engineArray)   
    AllnumListIndex= searchLineForNum(engineArray)
    goodNum += findGoodNum(charIndex,AllnumListIndex)
    gearIndex = findGearList(engineArray)
    gearTotalRatio= findGearRatio(gearIndex, AllnumListIndex)
    print(goodNum)
    print(gearTotalRatio)

# splits the input text into lines and stores them in an array with an extra "dummy layer" of "......"
def splitinput():
    engineArray= []
    with open("day3_1.txt", "r") as engine:
        for line in engine:
            if engineArray == []:
                engineArray.append("."*len(line))
            line1 = line.strip('\n')
            engineArray.append(line1)
        engineArray.append('.'*len(line))
    return engineArray

#creates a list of lists, each containing the number in list form, the indexes of that number and the line the number is found on
def searchLineForNum(engineArray):
    allNumListIndex =[]
    iter=0
    for line in (engineArray): 
        
        allIndex =[]
        
        for i in range(len(line)):
            numberList= []
            indexList = []
            if i not in allIndex:
                if line[i].isnumeric():
                    numberList.append(line[i])
                    indexList.append(i)
                    k=1
                    while  i+k < len(line) and line[i+k].isnumeric():
                        
                        numberList.append(line[i+k])
                        indexList.append(i+k)     
                        k+=1
                    
                    for j in indexList:
                        allIndex.append(j) 
                    tempNum = ""
                    for number in numberList:
                        tempNum = tempNum + number
                    number = int(tempNum)
                    currentLoop=[number,indexList,iter]
                    allNumListIndex.append(currentLoop)
        iter+=1


    return allNumListIndex

                                
        
                
        
# creates a list of indexes for each char in a line
def searchLineForChar(engineArray):
   
    totalCharIndex = []

    for line in engineArray:
        currentCharIndex =[]
        for j in range(len(line)):
            if line[j] != '.' and not line[j].isnumeric():
                    currentCharIndex.append(j)
        totalCharIndex.append(currentCharIndex)
    return totalCharIndex


#searches for each good number by iterating through each set of number,coords and line value and comparing those index values with  aline above and below
def findGoodNum(charIndex, allNumListIndex):
    #initializes goodnum value
    goodNum = 0
    #loop through each number
    for i in range(len(allNumListIndex)):
        #set check to false each time a new number is accessed
        goodNumCheck = False
        #sets up a value that is  i + (-1, 0, 1)
        for charLine in range(allNumListIndex[i][2]-1,allNumListIndex[i][2]+2):\
            #grabs the indexes of the current number and iterates through them
            for numIndex in allNumListIndex[i][1]:
                    #if numindex + or - 1 is in charindex sets check to true
                    if numIndex in charIndex[charLine]:
                        goodNumCheck = True
                    elif numIndex + 1 in charIndex[charLine]:
                        goodNumCheck = True
                    elif numIndex -1 in charIndex[charLine]:
                        goodNumCheck = True
        #if number is good converts it from string to int out of the list
        if goodNumCheck:
            
            goodNum += allNumListIndex[i][0]
    return goodNum

#part 2

def findGearList(engineArray):
    
    totalCharIndex = []

    for line in engineArray:
        currentCharIndex =[]
        for j in range(len(line)):
            if line[j] == '*':
                    currentCharIndex.append(j)
        totalCharIndex.append(currentCharIndex)
    return totalCharIndex

def findGearRatio(gearIndex, allNumListIndex):
    #initializes totalgearratio value
    totalGearRatio = 0
    #loop through each line
    for lineNumber in range(len(gearIndex)):
        #if line has a gear
        if gearIndex[lineNumber] == []:
            continue
        #for each valid index in gearindex
        for gear in gearIndex[lineNumber]:
            gearRatioNum = []
            #if line numbers match + or - 1
            for numList in allNumListIndex:
                # #iterates -1 to 1
                for lineRange in range(-1,2):
                #iterated through each numlist
                    if numList[2] != lineRange+lineNumber:
                        continue
                    #iterates through index
                    for index in numList[1]:
                        # adds range to gear
                        for gearRange in range(-1,2):
                            #if the gear index +- 1 = index
                            if gear + gearRange != index:
                                continue
                            #checks for duplicates
                            if numList[0] not in gearRatioNum:
                            #adds number to gearRatio
                                gearRatioNum.append(numList[0])       
        #if number is good converts it from string to int out of the list
            if len(gearRatioNum) >= 2:
                gearRatio = gearRatioNum[0] * gearRatioNum[1]
                totalGearRatio +=gearRatio
    return totalGearRatio
main()

