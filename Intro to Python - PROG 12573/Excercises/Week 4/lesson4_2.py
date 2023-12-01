# number = int(input("Enter a number: "))
# if number % 2 == 0:
#     print('The number is even')
# else:
#     print("The number is odd")

# number = str(input('Enter a number: '))
# if number.isdigit == True:
#     print(f"You've entered the number {number}")
# else:
#     print(f"You've entered the string {number}")


# year = int(input('Enter a Year'))

# if year % 4 == 0 and not year % 100 == 0 and not year % 100 == 0 or year % 400 == 0:
#     print(f'{year} is a leap year')
# else:
#     print(f'{year} is not a leap year')

# college = input('Which college are you attending? ')

# if college.title() == 'Sheridan':
#     print("Good Choice")
# else:
#     print(f'Why would you go to {college.title()}.\nHave you considered Sheridan')

# word1 = input("Enter the first string: ")
# word2 = input("Enter the second string: ")

# if word1 > word2:
#     print(f'{word2} {word1}')
# else:
#     print(f'{word1} {word2}')

import turtle
import random

def box():
    index = 3
    while index >=0:
        my_t.forward(50)
        my_t.left(90)
        index -= 1
wn = turtle.Screen()
my_t = turtle.Turtle()
my_t.shape('turtle')
num =random.randint(1,2)
if num == 1:
    my_t.color("red")
    my_t.circle(50)
else:
    my_t.color("blue") 
    box()

if my_t.pencolor() == "red":
    my_t.forward(100)

turtle.done()