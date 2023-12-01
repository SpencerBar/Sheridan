import random
import wordlist

def nameCheck():

    print('The Hangman')
    name1 = input('Player 1 please enter your name: ')
    print("Welcome ", name1 )
    return name1

def ruleCheck():
    while True:
        runRule = input("Do you understand the rules (y/n)")
        if runRule == "y":
            return True
        elif runRule == "n":
            print('                   To play this game, we will decide a word and you the player will guess which word it is one letter at a time.\n\
                   If you guess the a letter that the word contains, all of those letters will fill themsleves in.\n\
                  However if you guess a letter the word does NOT contain, a part of your body will be drawn.\n\
                  When all of your body is "hanging", you lose the game.')



def playLoop(): #checks whether ot exit at the end of the game or recall main

    
    while True:
        playAgain = input("Would you like to play again?(y/n)")
        if playAgain == "y":
            break
        elif playAgain == "n":
            print("Thanks for playing!")
            exit()
            
def gamePlay():

    runGame = True
    while runGame == True:
        global count # will be iterated as the game progresses
        global blankWord# displays the word spaces
        global wordChosen # stores the chosen word  
        global lettersGuessed # checks which letters have been selected
        global wordLength
        limit = 5
        print(blankWord)
        choice = input("\nEnter your guess: \n") # takes guess input
        choice = choice.strip()
        

        if len(choice.strip()) == 0 or len(choice.strip()) >= 2 or choice <= "9" : # makes sure the input was a valid letter
            print('Invalid Input\n')

        elif choice in lettersGuessed:
            print("Already Guessed!\n")

        elif choice in wordChosen:# if its a correct guess
            lettersGuessed.extend([choice])  # adds letter to letters guessed
            
            while choice in wordChosen:
                index = wordChosen.find(choice)
                if index < wordLength:
                    wordChosen = wordChosen[:index] + "_" + wordChosen[index +1:] # finds the letter in the hidden word and adds _ to the index to hide it 
                    blankWord = blankWord[:index] + choice + blankWord[index +1:] # writes the letter for the player
                    print(blankWord, "\n")
            if wordChosen == "_" * wordLength: # exit condition
                print("Congrats You Guessed the Word!")
                runGame = False
                break
        else:
            count += 1
            if count < 5: 
                print ("Unfourtunately your guess was wrong.\n Only ", limit - count, "guesses remain")
                hangman = [ "   _____ \n  |     |\n  |     |\n  |     |\n  |      \n  |      \n  |      \n__|__\n",\
                            "   _____ \n  |     |\n  |     |\n  |     |\n  |     o\n  |      \n  |      \n__|__\n",\
                            "   _____ \n  |     |\n  |     |\n  |     |\n  |     o\n  |     |\n  |      \n__|__\n",\
                            "   _____ \n  |     |\n  |     |\n  |     |\n  |     o\n  |    /|\ \n  |      \n__|__\n"]
                print(hangman[count-1])
            else:
                print("   _____ \n  |     |\n  |     |\n  |     |\n  |     o\n  |    /|\ \n  |    / \ \n__|__\n","Oh No! You've been Hanged!\n", "The word was")
                break
        
       
                    

def main():
    global count # will be iterated as the game progresses
    global blankWord# displays the word spaces
    global wordChosen # stores the chosen word  
    global lettersGuessed # checks which letters have been selected
    global wordLength # stores word length for win condition
    global name
    
    name = nameCheck() # gets players name
    ruleCheck() # makes sure player understand the rules
    wordChosen = random.choice(wordlist.wordLibrary) # chooses word from library at random
    wordLength = len(wordChosen)  #assigns value to wordlength
    count = 0
    lettersGuessed = [] 
    blankWord = "_" * wordLength
    gamePlay()                   

            
while True:
    main()
    playLoop()