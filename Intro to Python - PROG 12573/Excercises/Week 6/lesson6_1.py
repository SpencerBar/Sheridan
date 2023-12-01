# MIN_LAT = -90
# MAX_LAT = 90
# MIN_LON = -180
# MAX_LON = 180
# latitude = float(input("Enter a valid latitude: "))
# while MIN_LAT > latitude or latitude > MAX_LAT:
#     print(f'{latitude} is not a valid latitude')
#     latitude = float(input("Enter a valid latitude: "))
# longitude = float(input("Enter a valid Longitude: "))
# while MIN_LON > longitude or longitude> MAX_LON:
#     print(f'{longitude} is not a valid longitude')
#     longitude = float(input("Enter a valid Longitude: "))
# print(f'{latitude:.6f}, {longitude:.6f}')

# number = -1
# count = -1
# total = 0

# while number !=0:
#     number = int(input("Enter a number or 0 if you want to quit: "))
#     total += number
#     count +=1


# average = total / count
# print(f'You entered {count} numbers and the average is {average}')

# number = -1
# count = 0
# total = 0
# cont = 'yes'
# while cont.lower() == 'yes':
#     number = int(input("Enter a number or 0 if you want to quit: "))
#     total += number
#     count +=1
#     cont = input('Enter yes to continue or no to end: ')



# average = total / count
# print(f'You entered {count} numbers and the average is {average}')

number = -1
count = 0
total = 0
cont = 0
while True:
    number = input("Enter a number or end if you want to quit: ")
    if number.isdigit():
        total += int(number)
        count +=1
    else:
        break
if count != 0 and count != 1:
    average = total / count -1
print(f'You entered {count} numbers and the average is {average}')
