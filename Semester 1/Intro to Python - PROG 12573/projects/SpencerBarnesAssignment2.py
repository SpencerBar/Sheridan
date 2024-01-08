# SpencerBarnesAssignment2.py
# Author: Spencer Barnes
# Date: November 26th 2023 (10/26/2023)

# Description: A program which takes user input of
# income and tax paid and calculates
# how much is owed by the government or the
# taxpayer

# These constants set the tax brackets for those with:

# less than 20,000
TAX_RATE_LOW = 0

# 20,000 - 49,999
TAX_RATE_BASE = .10
TAX_BR_BASE = 20000

# 50,000 - 99,999
TAX_RATE_MID = .18
TAX_BR_MID = 50000

# 100,000+
TAX_RATE_HIGH = .25
TAX_BR_HIGH = 100000

# asks for amount of income
annIncome = input('Income amount: ')

# ensures valid input for annual income
while True:

# makes sure income is a number
    if not annIncome.replace('.','',1).replace('-','',1).isnumeric():
        print('Income must be a number!')
        annIncome = input('Enter your annual income: ')

# makes sure annual income is not below 0
    elif float(annIncome) < 0.0:
        print('Income cannot be less than zero!')
        annIncome = input('Enter your annual income: ')

# if all conditions are true then continues the program
    else:
        break

# makes input a float
annIncome = float(annIncome)

# asks for tax already paid this year
taxToDate = input('Tax amount already paid: ')

while True:
   
#checks if taxToDate is a number
    if not taxToDate.replace('.','',1).replace('-','',1).isnumeric():
        print('The tax paid cannot contain letters!')
        taxToDate = input('Tax amount already paid: ')

#checks that taxToDate is not less than zero
    elif float(taxToDate)<0.0:
        print('The tax paid cannot be less than 0!')
        taxToDate = input('Tax amount already paid: ')

# check that taxToDate is not greater than or equal to income
    elif float(taxToDate)>= annIncome:
        print('The tax paid cannot be equal or greater than the income!')
        taxToDate = input('Tax amount already paid: ')
# if all conditions are met continues
    else:
        break

# converts taxToDate to a float 
taxToDate = float(taxToDate)

# calculates tax rate based on tax bracket

# low income
if annIncome < TAX_BR_BASE:
    taxRate = TAX_RATE_LOW

# base taxable income
elif annIncome >= TAX_BR_BASE and annIncome < TAX_BR_MID: 
    taxRate =TAX_RATE_BASE

# medium taxable income
elif annIncome >= TAX_BR_MID and annIncome < TAX_BR_HIGH:
    taxRate = TAX_RATE_MID

# high taxable income
elif annIncome >= TAX_BR_HIGH:
    taxRate =TAX_RATE_HIGH

# calculates tax total 
taxTotal = annIncome * taxRate
taxDue = taxTotal - taxToDate

#prints total tax due
print(f'{"Base Tax":<23}${taxTotal:9,.2f}')

#print taxes already paid
print(f'{"Taxes already paid":<23}${taxToDate:9,.2f}')

# if tax total is more or equal to than taxes paid 
# displays how much is left to pay
if taxTotal >= taxToDate:
    
    print(f'{"Tax Payable":<23}${taxDue:9,.2f}')

# if tax total is less than taxes paid displays tax refund amount
elif taxTotal < taxToDate:
    print(f'{"Refund Due":<23}${taxDue * -1:9,.2f}')










