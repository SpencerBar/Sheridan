import random
import copy

fruits = ['Apple', 'Orange' , 'Lemon', 'Pear', 'Banana']
quantity = []

for i in range(len(fruits)):
    quantity.append(random.randint(1, 99))

# print(quantity)
fruitQuantity = fruits + quantity

# print(fruitQuantity)
quantityCopy = copy.deepcopy(quantity)
quantityCopy[len(quantityCopy)-1] = 100
# print (quantityCopy)

prices = [1.99, 1.49, 3.99, 2.99, 0.99]
fruitQuantityPrice = []
for i in range(len(fruits)):
    fruitQuantityPrice.append([fruits[i], int(quantityCopy[i]),float(prices[i])])

# print(fruitQuantityPrice)
totalCost = 0
cost = []
print(f'{"Fruit Name":<15}{"Quantity":<15}{"Price":<15}{"Cost":<15}')
print(f'----------------------------------------------------')

#print out the name quantity and price as well as calculate and print cost
for i in range(len(fruits)):
    cost.append(fruitQuantityPrice[i][1] * fruitQuantityPrice[i][2])
    print(f'{fruitQuantityPrice[i][0]:<15}' # fruit name
          f'{fruitQuantityPrice[i][1]:<15d}'# quantity
          f'{fruitQuantityPrice[i][2]:<15.2f}'#price
          f'{cost[i]:<15.2f}') #cost
    totalCost += cost[i] #total cost calucated 
print('----------------------------------------------------')

print(f'{"Total cost":<45}{totalCost:<15.2f}')