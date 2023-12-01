import random
def main():
    rollPair()
    return

def rollDice():
    return random.randint(1,6)

def printDice(die1, die2):
    print(f'{die1} and {die2} - a total of {die1 + die2}')

def rollPair():
    die1 = rollDice()
    die2 = rollDice()
    printDice(die1, die2)
    
main()