import math
import random
#exercise 2.2.1
billTotal = 35.78 # total orignal bill
TIPPERCENT = 15 # how much the person tipped in percentage
tipAmount= round(billTotal * TIPPERCENT/100)
totalCost = billTotal + tipAmount
print('Bill amount $', billTotal, '\nTip percentage ', TIPPERCENT, "\nTip amount $", tipAmount, "\nTotal $", totalCost )

#exercise 2.2.2
numberCents = totalCost * 100 #converting $ into cents
TOONIE = 200
LOONIE = 100
QUARTER = 25
DIME = 10
NICKEL = 5
PENNY = 1
numToonie = 0
numLoonie = 0
numQuarter = 0
numDime = 0
numNickel = 0
numPenny = 0
if(numberCents >= TOONIE) :  # calculates how many of each coin there would be to efficiently divide the cents into higher denominations
    numToonie = int(numberCents //TOONIE)
if (numberCents >= LOONIE):
    numLoonie = int(numberCents %TOONIE //LOONIE)
if(numberCents >= QUARTER):
    numQuarter = int(numberCents %TOONIE %LOONIE //QUARTER )
if(numberCents >= DIME):
    numDime = int(numberCents %TOONIE %LOONIE %QUARTER //DIME)
if(numberCents >= NICKEL):
    numNickel = int(numberCents %TOONIE %LOONIE %QUARTER %DIME //NICKEL)
if(numberCents >= PENNY):
    numPenny = int(numberCents %TOONIE %LOONIE %QUARTER %DIME %NICKEL //PENNY)

#prints the results
print ('Toonies:', numToonie, "\nLoonies:" , numLoonie, "\nQuarters:", numQuarter,"\nDimes:", numDime,"\nNickels:" ,numNickel,"\nPennies:" ,numPenny,sep=" ")

#exersice 2.2.4 
#1.
print(math.ceil(2.1))
print(math.floor(5.9))
print(math.exp(3))
print(math.log10(137))
print(math.tan(45**0))

#2.
#c = math.sqrt(a**2 + b**2)

#p = math.exp(x) + math.log10(x)

#sum = (a((r**n) - 1))/r-1

#exercise 2.2.5

def rollDice():  # is a function that returns the result of two d6 dice being rolled

        diceOne = random.randint(1,6) #rolls the die
        diceTwo = random.randint(1,6) 
        sumDice =  diceOne + diceTwo # adds the two die values
        print (diceOne, "and", diceTwo, "for a total of", sumDice)  #prints the results of the 2 die rolls
        return sumDice # returns the value to the caller

def diceGame():#is a simple automatic dice game
    

    
    while True: # makes sure someone wins
        playerOne = rollDice() #calling roll dice for players
        playerTwo = rollDice()
    
        if playerOne >playerTwo: # runs through the options to figure out the winner if one exists
            print("Player One wins with a ", playerOne, "over Player Two's ", playerTwo)
            break # breaks the loop
        elif playerTwo > playerOne:
            print("Player Two wins with a ", playerTwo, "over Player One's ", playerOne)
            break
        else :
            print("The players have both rolled a", playerTwo, "\nRolling again")

diceGame() # calls the function


