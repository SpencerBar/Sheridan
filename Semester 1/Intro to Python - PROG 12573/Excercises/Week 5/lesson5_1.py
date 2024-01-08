#5.1

# REQINCOME = 30000
# REQTIME = 2
# yearlyIncome = int(input("Enter your yearly income before taxes: "))
# diffIncome =  REQINCOME - yearlyIncome

# if yearlyIncome >= REQINCOME:
#     timeEmployed = int(input(
#         "How long in years have you been working at your current job: "))
#     diffEmploted = timeEmployed - REQTIME
#     if timeEmployed >=2:
#         print(
#             f"With your yearly income of {yearlyIncome} "
#             f"over the past {timeEmployed} you qualify for this loan")
#     else:
#         print(f"You must have been employed for 2 years to qualify"
#               f" you are short by {diffEmploted:<} years")
# else:
#     print(f"You must make at least $30,000 per year"
#           f"you are short {diffIncome}")

#5.2
# COMHIGH = .15
# COMMID = .10
# COMLOW = .075
# COMMIN = .05
# COMLOWTHRESH = 1000
# COMMIDTHRESH = 2000
# COMHIGHTHRESH = 3500
# comRate = 0
# totalComm = 0


# while True:

#     
#     if stopRun == "n":
#         break
#     else:

#         salePrice = float(input("How much was the sale: "))

#         if salePrice >= COMHIGHTHRESH:
#             comRate = COMHIGH
#         elif salePrice >= COMMIDTHRESH:
#             comRate = COMMID
#         elif salePrice >= COMLOWTHRESH:
#             comRate = COMLOW
#         elif salePrice < 1000 & salePrice > 0:
#             comRate = COMMIN
#         else:
#             print('INVALID SALE AMOUNT')

#         print(f"At a price of {salePrice} "
#             f" your commision is %{100 * comRate} "
#             f"for a total of {comRate * salePrice:.2f}")
#         totalComm += comRate * salePrice

#         print(f"Your total commission is: {totalComm}")
#         stopRun = str(input("Would you like to enter another sale? (y/n):"))

# 5.3
# Get the day number from the user
# day_num = int(input('Enter the day number: '))

# if day_num == 1:
#     day = "Monday"
# elif day_num == 2:
#     day = "Tuesday"
# elif day_num == 3:
#     day = "Wednesday"
# elif day_num == 4:
#     day = "Thursday"
# elif day_num == 5:
#     day = "Friday"
# elif day_num == 6:
#     day = "Saturday"
# elif day_num == 7:
#     day = "Sunday"
# else:
#     day = 'invalid day number'

# print(f'{day_num} is {day}')

#5.5


import turtle

scr = turtle.Screen()
scr.title('Show Coordinates')

bob = turtle.Turtle()
bob.shape('turtle')
bob.penup()
bob.left(45)
bob.forward(200)
if (bob.xcor() > bob.ycor()):
    bob.write('x-coordinate is greater than y-coordinate\n')
    bob.write(f'{bob.xcor()}, {bob.ycor()}')
elif (bob.xcor() < bob.ycor()):
    bob.write('x-coordinate is less than y-coordinate\n')
    bob.write(f'{bob.xcor()}, {bob.ycor()}')
else:
    bob.write('x-coordinate is equal to the y coordinate\n')
    bob.write(f'{bob.xcor()}, {bob.ycor()}')
turtle.done()

