import random as ran

def main():
    filename = 'output.txt'
    getInput(filename)
    filelist = readFile(filename)
    printFile(filelist)
    numFileName = 'numlist.txt'
    numGen(1,100,10,numFileName)
    numList= readFile(numFileName)
    printFile(numList)
    fruitSet('fruits.txt')
    fruType, fruQuan, fruPrice = fruitGet('fruits.txt')

def getInput(filename):

    while  True:
        temp= input("Enter a line (type 'exit' to finish): ") + "\n"
        if temp != "exit\n":
            with open(filename, 'a') as outFile:
                outFile.write(temp)
        else:
            print("Data written to 'output.txt'.")
            return 
  
def fruitSet(filename):
        while  True:
            temp = input("Enter the product name (type 'exit' to finish): ")
            if temp.lower() != "exit":
                templist = (temp + ',')
                templist += input(f'Enter the quantity of {temp}:') + ','
                templist +=input(f'Enter the quantity of {temp}:') + '/n'

            else:
                with open(filename, 'a') as outFile:
                    outFile.write(templist)
                print(f"Data written to '{filename}'.")
                return 

def fruitGet(filename):
    with open(filename, 'r') as fruits:
        for line in fruits:
           fruType, fruQuan, fruPrice = line.split(',')

           return fruType, fruQuan, fruPrice

def readFile(filename):
    filelist=[]
    try:
        with open(filename, 'r') as inFile:
            for line in inFile:
                filelist.append(int(line.rstrip('\n')))
            # print('Converted into int')
        return filelist
    except TypeError:
        with open(filename, 'r') as inFile:
            for line in inFile:
                filelist.append(float(line.rstrip('\n')))
                # print("Converted into float")
        return filelist
    except:
        with open(filename, 'r') as inFile:
            for line in inFile:
                filelist.append(line.rstrip('\n'))
                # print("Converted into String")
        return filelist

                

def printFile(listname):
    for i in listname:
        print(i)
         
def numGen(numMin, numMax, numLim, filename):
    with open(filename, 'w') as numDoc:
        for i in range(numLim):
            numDoc.write(str(ran.randint(numMin, numMax)) +'\n')



if __name__ == "__main__":
    main()