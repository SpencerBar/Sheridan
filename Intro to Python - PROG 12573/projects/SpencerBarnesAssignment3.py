# SpencerBarnesAssignment3.py
# Author: Spencer Barnes
# Date: November 17th 2023 (11/17/2023)

# A program that takes a single user input of several account balances and
# calculates the interest of each individual account and displays
# those values in a formatted table.

# constant interest value
INTRATE = 0.02

# main function
def main():
# calls getBalances() and assigns return value 
    balanceList = getBalances()
# calls getInterest() and assigns the calculated interests to intList
    intList = getInterest(balanceList)
# calls printResult() passing in both lists to print
    printResult(balanceList, intList)


# gets input and errorchecks before returning input as list
def getBalances():
# temporary value for input
    tempStr = input("Enter account balances seperated by a space: ")
# splits input into list
    balanceList = tempStr.split()
    while True:
# tries to convert string into floats  
        try:
            for i in range(len(balanceList)):
                balanceList[i] = float(balanceList[i])
# if can convert break from loop
            return balanceList         
        except: 
                print("Error incorrect formatting!")
# retry input
                tempStr = input(
                    "Enter account balances seperated by a space: ")


# get interest for each balance in the list
def getInterest(balanceList):
# makes a temporary list to append
    intList = []
# loops through each item in the list
    for i in range(len(balanceList)):
# calculates the interest and then adds it to the list
        intList.append((balanceList[i] * INTRATE) / 12)
    return intList

# prints the resutls in a formatted table
def printResult(balanceList, intList):
    print( '--------------------------------------')
    print(f'Accounts        Balance        Interest')
    print( '---------------------------------------')
# loops through each element and displays it 
    for i in range(len(intList)):
        print(f'Account: {i+1:<6}{balanceList[i]:>8.2f}{intList[i]:>13.2f}')

# makes sure to only run main when it is the main file
if __name__ == "__main__":
    main()