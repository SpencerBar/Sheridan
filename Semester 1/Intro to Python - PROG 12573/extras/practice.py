import random as randy
def main():
    randList = randyList(10)
    sortList = bubbleSort(randList)
    print(sortList)

def randyList(rng):
    randList = []
    for i in range(rng):
        randList.append(randy.randint(1,10))
    return randList

def bubbleSort(randList):
    for i in range(len(randList)):
        for x in range(len(randList)-i -1):
            if randList[x] > randList[x+1]:
                randList[x+1], randList[x] = randList[x],randList[x+1]

    return randList


main()