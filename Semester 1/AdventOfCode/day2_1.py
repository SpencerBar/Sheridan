def main():
    totalValid = 0
    sumMin=0
    with open("day2_1.txt", "r") as gameList:
        for line in gameList:
           totalValid += searchFunction(line)
           sumMin += minReq(line)
    print(f'totalValid = {totalValid}')
    print(f'S\sumMin = {sumMin}')
          



def searchFunction(line): 
    line = line.strip('\n')   
    removeGame = line.split(':')
    
    games=removeGame[1].split(';')
    
    for i in range(len(games)):
        game = (games[i].split(','))
        blueRun = 0
        redRun = 0
        greenRun = 0
        for b in range(len(game)):
            numberColor = game[b].split(' ')
            if numberColor[2] == 'blue':
                blueRun += int(numberColor[1])
            elif numberColor[2] == 'red':
                redRun += int(numberColor[1])
            elif numberColor[2] == 'green':
                greenRun += int(numberColor[1])
    
            if blueRun > 14:
                return 0
            elif redRun > 12:
                return 0
            elif greenRun > 13:
                return 0
            
    validGame = removeGame[0].split(' ')
    return int(validGame[1])


def minReq(line):
    line = line.strip('\n')
    removeGameNum = line.split(':')
    games = removeGameNum[1].split(';')
    blueRun = 0
    redRun = 0
    greenRun = 0
    for i in range(len(games)):
        game = games[i].split(',')
        for b in range(len(game)):
            numberColor = game[b].split(' ')
            if numberColor[2] == 'blue':
                if int(numberColor[1]) > blueRun:
                    blueRun = int(numberColor[1])
            elif numberColor[2] == 'red':
                if int(numberColor[1]) > redRun:
                    redRun = int(numberColor[1])
            elif numberColor[2] == 'green':
                if int(numberColor[1]) > greenRun:
                    greenRun = int(numberColor[1])
    return greenRun * redRun * blueRun
    


    
main()