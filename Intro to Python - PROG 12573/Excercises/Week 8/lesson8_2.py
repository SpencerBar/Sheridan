# courses = ('PROG12583','SYST10049', 'TELE16167', 'COMM12729','MATH18584')
# grades = (89.00, 95.9, 93.2, 60.0, 95.0)
# index = 0
# for c in courses:
        
#         print(f'{c:<20}{grades[index]:<4.1f}')
#         index += 1



# print(f'{courses[::2]}{grades[::2]}')

# highest =  max(grades)
# lowest = min(grades)
# avg = sum(grades)/len(grades)

# print(f'MAX:{highest} MIN:{lowest} AVG:{avg}')


produce ={}
produce['name'] = 'Apple'
produce['quantity']= 4.5
produce['unit'] = 'kg'
produce['price'] = 1.99
produce['variety'] = 'Red delicious'
print(produce)

produce['unit'] = 'lbs'
print(produce)
del produce['variety']
print(produce)

for i in produce:
        print(f'{i:10}{produce[i]}')

# engToFren = {'book':'livre','pencil':'crayon','pen':'stylo','meal':'repas','shirt':"chemise"}
# frenToSpan = {'livre':'lobro','crayon':'lapiz','stylo':'boligrafo','repas':'comida','chemise':"camisa"}

# userIn = input("Enter an english word: ")

# if userIn in engToFren:
#         print(frenToSpan[engToFren[userIn]])
# else: 
#     print('Sorry word not found!')

print(produce.get('name', 'Entry does not exist'))
print(produce.get('variety', 'Entry does not exist'))
print(list(produce.items()))
print(list(produce.keys()))
print(list(produce.values()))
lastKey, lastVal = produce.popitem()
print(lastKey,lastVal)
print(produce)

produce.clear()
print(produce)

courses = ('PROG12583','SYST10049', 'TELE16167', 'COMM12729','MATH18584')
grades = (89.00, 95.9, 93.2, 60.0, 95.0)

import random
lotto = set()
while len(lotto)<6:
        lotto.add(random.randint(1,50))
print(lotto)


courseGrades=set()
index = 0
for i in courses:
        temptuple = (i, grades[index])
        courseGrades.add(temptuple)
        index += 1
print(courseGrades)