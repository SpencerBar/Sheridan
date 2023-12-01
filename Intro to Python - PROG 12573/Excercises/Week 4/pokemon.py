import random
import pyautogui
import pydirectinput
import numpy as np


lastPlayerCoord = [0, 0]
playerCoord = [0, 0]
isBattle = False
isGrass = [0]
xCoords, yCoords = np.meshgrid(range(100), range(100)) #setting up coordinate grid array 
gridCoord = np.array([xCoords, yCoords])


#randomly decides grass
def setGrass():
        global isGrass
        
        for i in gridCoord[0]:
            for i in gridCoord[1]:
                if random.randrange(2) == 1:
                    isGrass.append(1)    
                else:
                    isGrass.append(0)
                    
    
     
# checks if the player is in the grass or not based upon a grid map
def GrassCheck(playerCoord): 
        global isGrass
        index = 0
        for playerCoord[0] in gridCoord[0]:
            index +=1 
            # iternates through the first coord
            for playerCoord[1] in gridCoord[1]: 
                index +=1
                if isGrass[index] == True: #checks if grass is true or false
                    return True
                else:
                    return False
        

def BattleRoll(inGrass):
    global isBattle
    
    if inGrass == True:
        battleRoll = random.randrange(0,4)
        if battleRoll <=2:
            isBattle = True
        else:
            isBattle = False
        return
    
# get the player input each cycle
def GetInput():
    global playerCoord
    global lastPlayerCoord
    
    if pydirectinput.keyDown("w"):
        lastPlayerCoord = playerCoord
        playerCoord += [1,0]
    elif pydirectinput.keyDown('s'):
        lastPlayerCoord = playerCoord
        playerCoord += [-1, 0]
    elif pydirectinput.keyDown('a'):
        lastPlayerCoord = playerCoord
        playerCoord += [0, -1]
    elif pydirectinput.keyDown('d'):
        lastPlayerCoord = playerCoord
        playerCoord += [0, 1]
    if playerCoord[0] >=w100 or playerCoord[1] >=100 or playerCoord[0] <= 0 or playerCoord[1] <=0:
        playerCoord = lastPlayerCoord

    
    return
#main movement loop  
def PlayerMovement():
    global playerCoordww
    GetInput()
    print(playerCoord)
    inGrass = GrassCheck(playerCoord)
    print(inGrass)
    BattleRoll(inGrass)
    print('Battle: ', isBattle)

    return
    


        


while True:
    setGrass()
    print("Grass: ", isGrass)
    if isBattle == False:
        PlayerMovement()
        
        



        