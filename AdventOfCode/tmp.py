def checkRealWinnings(scoreList):
    
    
    for card in range(len(scoreList)):
        cardMatchingNumber = 0
        for number in scoreList[card][1]:
            for winningNumber in scoreList[card][0]:
                if winningNumber != number:
                    continue
                cardMatchingNumber += 1
        if cardMatchingNumber == 0:
            continue
        for i in range(1, cardMatchingNumber+1):
            if scoreList[card + i] <= len(scoreList):
                scoreList[card+i][0] = scoreList[card+i][0] + 1
    return scoreList    

def countCardNum(scoreList):
    totalCards = 0
    for card in range(len(scoreList)):
        totalCards += scoreList[card][0]
    print(totalCards)
