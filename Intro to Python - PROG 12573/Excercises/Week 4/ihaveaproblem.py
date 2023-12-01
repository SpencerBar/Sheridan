import random
def lickAss(x):
    numLick = x
    if numLick > 0:
        lick = 0
        lick +=random.randint(0,1)
        numlick -= 1
        if lick >0:
            return True
        else:
            return False
def eatAss():
    print('taste check')
    numLick=0
    isPoop = lickAss(numLick)
    if isPoop == True:
        print('Youve tastes the most bitter of fruits and shall never be the same')
        print('You puke')
    else:
        numLick = input("a tasty treat, how many times to lick")
        isEnjoy = lickAss(numLick)
        if isEnjoy >=1 & isEnjoy<=numLick:
            print("it was pretty good")
        elif isEnjoy == numLick:
            print('Holy fuck I came from my ass, ive never had an experience like that before')
        else: 
            print('Pathetic')


eatAss()