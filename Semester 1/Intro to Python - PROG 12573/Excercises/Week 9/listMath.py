def main():
    list = getList()
    total = getTot(list)
    avg = getAvg(total, list)
    max = getMax(list)
    min = getMin(list)
    printValues(total, avg, max, min)


def getList():
    list = []
    listLen = int(input('Enter how many numbers do you want to add:'))
    for i in range(listLen):
        list.append(int(input('Enter an integer: ')))
        
    return list

def getTot(list):
    runningTot = 0
    for i in range(len(list)):
        runningTot += list[i]
    return runningTot
   

def getAvg(total, list):
    return total / int(len(list))

def getMax(list):
    temp = 0
    for i in range(len(list)):
       
        if list[i] > temp:
            temp = list[i]
    return temp

def getMin(list):
    temp = list[1]
    for i in range(len(list)):
        if list[i]< temp:
            temp = list[i]
    return temp

def printValues(total, avg, max, min):
    print(f'Total is {total}')
    print(f'Average is {avg}')
    print(f'Max is {max}')
    print(f'Min is {min}')

main()