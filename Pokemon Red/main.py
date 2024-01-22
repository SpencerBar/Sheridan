import random

def generateID():
    #generate a unique id by taking trainer id and  species id and generating for each previously caught pokemon of that species
    return


class Moveset:
    def __init__(self, levelset, teachset):
        self.__levelset = levelset
        self.__teachset = teachset

    def level(self):
        return self.__levelset
    def taught(self):
        return self.__teachset
    
class Species:
    def __init__(self, number, name, health, attack, defense, speciala, speciald, moveset, caught = False):
        self.__number = number
        self.__name = name
        self.__health = health
        self.__attack = attack
        self.__defense = defense
        self.__speciala = speciala
        self.__speciald = speciald
        self.__levelset = moveset.level
        self.__moveset = moveset.taught


class Pokemon:
    def __init__(self, species, encounterLoc):
        id = generateID()
        self.__species = species
        self.__level = random.randint(encounterLoc.minLvl, encounterLoc.maxLvl) 
        self.__health = species.__health + random.randint(0,15)
        self.__attack = species.__attack + random.randint(0,15)
        self.__defense = species.__defense + random.randint(0,15)
        self.__speciala= species.__speciala + random.randint(0,15)
        self.__speciald = species.__speciald + random.randint(0,15)
        self.__moves = species.__moveset + random.randint(0,15)
    def caught():
        #add pokemon to a caught list (box or party etc)

    def levelUp(self):
        if self.__level < 100:
            self.__level += 1
            for i in self.__species.__levelset:
                if self.__species.__levelset[i] == self.__level:
                    self.learnMove(self.__species.__levelset[i])

    def learnMove(self, move):
        
        while True:
            learn = input("Do you want to learn the move?:")
            if learn == "y": # change this later t be input based on whether move it wanted
                # have player choose which move to replace or not to learn
                replace = input("which move do you want to replace")
                if replace == "n":
                    continue
                else:
                    confirm = input(f"replace {self.__moves[replace]}?")
                    if confirm == "n":
                        continue
                    else:
                        self.__moves[replace] = move
            elif learn == 'n':
                exit = input(f"give up on learning {move}?")
                if exit == 'y':
                    return
                else:
                    continue
            
                

            
    

def speciesList(namelist, statlist, moveset):
    limit = 150
    index = 0
    speciesList = []
    while index < 150:
        tempSpecies = Species(index+1,namelist[index],statlist.health, statlist.attack, statlist.defense, statlist.special, moveset.level(), moveset.taught())
        speciesList.append(tempSpecies)