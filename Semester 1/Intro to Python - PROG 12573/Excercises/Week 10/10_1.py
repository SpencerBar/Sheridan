# def main():

#     return True


# class getRekt:
    
#     def getDict():
#         return dict
#     def getDictEle(name):
#        return dict.get(name)
#     def setDict(name, value):

#         dict = value
#     def addToDict(name, value):
#         dict[name] = value


#     __dict = {}


# def main():
#     myTuple = getTuple()
#     avg = calcAvg(myTuple)
#     print(f"{avg}")

 


# def calcAvg(tuple):
#     total = 0
#     for i in range(len(tuple)):
#         total += tuple[i]
#     return total / len(tuple)

# def getTuple():
#     index = input("How many numbers to add into tuple?: ")
#     while not index.isnumeric:
#         print(f"Error {index} is not an integer!")
#         index = input("How many numbers to add into tuple?: ")
#     tuple = ()
#     for i in range(int(index)):
#         integer = input("Enter an integer: ")
#         while not integer.isnumeric:
#             print(f"Error {integer} is not an integer!")
#             integer = input("Enter an integer: ")
#         tuple = tuple + (int(integer),)
#     return tuple

# main()

# wordCounts = {"apple": 5, "banana": 3, "cherry": 2, "date": 1}
# def main():
#     print(countWords(wordCounts))
  

# def countWords(wordDict):
#     total = 0
#     for i in wordDict:
#         total += wordDict[i]
#     return total

# main()

# list = []
# tuple = ()
# dict = {}


def main():
    name = makeDict(getName())
    print(name)

def getName():
    name = input("Enter your first last and middle name: ")
    
    return name.split()

def makeDict(namelist):
    nameDict={'first':namelist[0],'middle':namelist[1],'last':namelist[2]}
    return nameDict
main()