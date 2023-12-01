travDest =input("Enter travelling destination:")
travDist = float(input("Enter travelling distance:"))

travTime = float(input("Enter travelling time to " + travDest))
avgSpeed = travDist / travTime
print('Travelling to', travDest,'\nTravelling to:',travDist, "\nAverage speed:", avgSpeed, "km/hrs")

num1, num2 = input('Enter two numbers: ').split()
num1, num2 = (float(num1), float(num2))

print('One\nTwo\nThree')
print('Mon\tTues\tWed\tThur\tFri\tSat')
print("He said: \"I\'m coming tomorrow\"")
print('The path is C:\\temp\\data.')

#[field_width][comma][.decimal_places][type_code] are types of variables the format function takes
print('The number is', format(12345.6789, '12,.2f')) # commas field width and floating point
print('The number is', format(12345.6789, '12.2f')) # floating point not comma and field width
print(format(12345.6789, 'e')) #scientific notation
print(format(12345.6789, '.2E')) # sci notif with 2 decimals only
print(format(0.5, '%'))  # percent (writes 50.0000)
print(format(0.5, '.0%')) # no decimals  percent

avg_price = 59.7834
print(format(avg_price, '.2f'))
print('{:.2f}'.format(avg_price))
bigNumber = 45963726.742168
print(format(bigNumber, '.1e'))
print('{:.1e}'.format(bigNumber))
smallNumber = 0.00000078234
print(format(smallNumber, '.3e'))
print('{:.3e}'.format(smallNumber))
valueChange = 0.002146
print(format(valueChange, '.1%'))
print('{:.1%}'.format(valueChange))


print('The value is {:d}'.format(12345)) # {:d} is a placeholder

# integer
int_number = 12345
print('{:9d}'.format(int_number)) # four spaces at the front
print('{:,d}'.format(int_number)) # 12,345
# floating-point number
float_number = 0.06789
print('{:.2f}'.format(float_number)) # 0.07
print('{:.4f}'.format(float_number)) # 0.0679
print('{:.2e}'.format(float_number)) # 6.79e-2

name = 'Johnny'
print(f'Hello {name}.')
number = 1234567890.12345
print(f'{number:,}')
print(f'{number:,.2f}') 
print(f'{number :e}')
discount = 0.5
print(f'{discount:%}')
## generally numbers are right aligned and strings are left aligned ("      600") vs ("joe     ")
#use <>^ to align left right and center
print(f'{number :>20.2f}')
TAX = 0.13
TIP= 0.15

amount = float(input("Enter the purchase amount:"))
taxAmount = amount * TAX
tipAmount = amount * TIP
totalAmount = amount+taxAmount+tipAmount
print(f'{"Purchase amount:":20}{amount:7.2f}') 
print(f'{"Tax:":20}{taxAmount:7.2f}')
print(f'{"Tip:":20}{tipAmount:7.2f}')
print(f'{"Total:":20}{totalAmount:7.2f}')