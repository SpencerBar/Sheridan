# from datetime import datetime
# lasttime = datetime.now()
# while True:
#     for hours in range(24):
#         for minutes in range(60):
#                 for seconds in range(60):
#                     if (datetime.now() -lasttime).seconds == 1:
#                         print(f'{hours :02d}:{minutes :02d}:{seconds :02d}')
#                         lasttime = datetime.now()
                    
                        
# for indexa in range(1,6):
    
#     for indexb in range(1,6):
#         value = indexb+indexa
#         print(f'{value}',end="\t")
#     print(f"\n")

# rows = int(input('Enter rows: '))
# columns = int(input('Enter column: '))
# character = input('Enter a character: ')             

# for index in range(rows):
#     for indexb in range(columns):
#         print(f'{character}',end="\t")
#     print('\n')
    
# rows = int(input('Enter rows: '))

# character = input('Enter a character: ')             

# for index in range(rows):
#     for indexb in range(index+1):
#         print(f'{character}',end="\t")
#     print('\n')


# rows = int(input('Enter rows: '))

# character = input('Enter a character: ')             

# for index in range(rows):
#     for indexb in range(rows - index):
#         print(f'{character}',end="\t")
#     print('\n')
    
# players = int(input('Enter the number of players: '))
# games = int(input('Enter number of games: '))

# for player in range(players):
#     score = 0
#     for game in range(games):
#         score+= int(input(f'Game {game+1}: '))
#     print(f'Average Score: {score/(games):.2f}')
CELSIUS_CONV = 5.0/9.0  
startTemp = float(input('Enter the starting Temp(f): '))
endTemp = float(input('Enter the final Temp(f): '))

if startTemp < endTemp:
    for i in range(int(startTemp), int(endTemp+1)):
        tempC = (CELSIUS_CONV) * ((i)-32)
        print(f'{i:<10.2f} is {tempC:>10.2f}')
       
else:  
    for i in range(int(startTemp), int(endTemp -1), -1):
        tempC = (CELSIUS_CONV) * ((i)-32)
        print(f'{i:<10.2f}f is {tempC:>10.2f}c')
       
