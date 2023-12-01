# def checkForwards(list):
#     minIndex = 0
#     maxIndex=0
#     min=10
#     max=0
#     temp = []
#     #iterating through index of list of words (1-9*2)
#     for i in range(len(list)):
#         try:
#             temp.append(line.find(list[i]))
#         except:ValueError(f'{list[i]} not found in line')
            
#         for b in range(len(temp)):
        
#             if temp[i] <= min and temp[i] !=-1:
#                 min = temp[i]
#                 minIndex = i
#             if temp[i] >= max and temp[i] !=-1:
#                     max = temp[i]
#                     maxIndex = i
#     if  minIndex >=0 and minIndex <=8:
#             min = minIndex+1
#     else:
#           min = list[minIndex]
#     if maxIndex >=0 and maxIndex <=8:
#             max = maxIndex+1
#     else:
#           max = list[maxIndex]
#     return int(str(min) + str(max))

def checkForwards(list, line):
    firstNum = -1
       
    for i in range(len(line)):   
        for key in list:
            if i <= (len(line) - len(key)):
                searchResult=line.find(key,i ,i+len(key))
                if searchResult != -1:
                    firstNum = list[key]
                    return firstNum
                

def checkBackwards(listBackwards, line):
    lastNum = -1
    for i in range(len(line)): 
        for key in listReversed:
            if i <= (len(line)-len(key)):
                reversedLine=''.join(reversed(line))
                searchResult = reversedLine.find(key,i,(i+len(key)))
                if searchResult != -1:
                    lastNum = listReversed[key]
                    return lastNum
                
    
  
list = {'one': 1,'two': 2,'three': 3,'four' : 4,'five':5,'six':6,'seven':7,'eight':8,'nine':9,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}  
listReversed = {'eno':1,'owt':2,'eerht':3,'ruof':4,'evif':5,'xis':6,'neves':7,'thgie':8,'enin':9,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}
runTotal= 0
with open("day1_1.txt", "r") as keytext:
    for line in keytext:
        firstNum = str(checkForwards(list, line))
        lastNum = str(checkBackwards(listReversed,line))
        if lastNum == -1 or lastNum == 'None':
            lineTotal = int(firstNum+firstNum)
            print(lineTotal)
            runTotal += lineTotal
        else:
            lineTotal = int(firstNum + lastNum)
            print(lineTotal)
            runTotal += lineTotal
        print(line)
        
print(runTotal)