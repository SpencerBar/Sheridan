def main():
    scoreList = readScoreCard()
    checkWins(scoreList)
    scoreList = checkRealWinnings(scoreList)
    countCardNum(scoreList)

def readScoreCard():    
    scoreList = []
    with open('day4_1.txt',"r") as scoreCard:
        for line in scoreCard:
            temp = line.split(":")
            currentLine = temp[1].strip('\n')
            temp =currentLine.split('|')
            winningNumList = temp[0].split()
            scoreCardNumList = temp[1].split()  
            scoreList.append([1,winningNumList ,scoreCardNumList])
    return scoreList


def checkWins(scoreList):
    totalMatchPoints = 0
    pointsScore = [0,1,2,4,8,16,32,64,128,256,512]
    for card in range(len(scoreList)):
        cardMatchingNumber = 0
        for number in scoreList[card][2]:
            for winningNumber in scoreList[card][1]:
                if winningNumber != number:
                    continue
                cardMatchingNumber += 1
        totalMatchPoints += pointsScore[cardMatchingNumber]

    print(totalMatchPoints)


def checkRealWinnings(scoreList):
    
    
    for card in range(len(scoreList)):
        cardMatchingNumber = 0
        for number in scoreList[card][2]:
            for winningNumber in scoreList[card][1]:
                if winningNumber != number:
                    continue
                cardMatchingNumber += 1
        if cardMatchingNumber == 0:
            continue
        for i in range(1, cardMatchingNumber+1):
            if card + i <= len(scoreList):
                scoreList[card+i][0] = scoreList[card+i][0] + 1 * scoreList[card][0]
    return scoreList    

def countCardNum(scoreList):
    totalCards = 0
    for card in range(len(scoreList)):
        totalCards += scoreList[card][0]
    print(totalCards)        

    

main()