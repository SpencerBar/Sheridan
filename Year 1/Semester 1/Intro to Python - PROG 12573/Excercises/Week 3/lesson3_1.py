#3.1.1
#num = 25 #initialize num
#num += 15 # add 15 to num
#num *= 2 # multiply by 2
#num /= 3 # divide by 3
#result = "The result" # create string 
#result += " is " # add to string end
#result += str(num) #add num as a string to the end of string
#print(result) # print result


#3.1.2
a = 5
b = 2
c = 4
d = 6
e = 7

#print(a > b)
#print(a != b)
#print(d % b == c % b)
#print(a* c != d * b)
#print(d * b == c * e)
#print(a * b < a % b * c)
#print(c % b * a != a * b)
#print(b % c * a != a * b)
#print(d % b * c > a or c % b * d < e)
#print(d % b * c > a and c % b * d < e)

# 3.1.3

#a = 5
#b = 10
#c = 15
#d = False
#print(a < b and b < c)
#print(c > a and d)
#print(not d and b > c)
#print(a > b and b > c or not d)
#print(b < a or d and b < c)

# 3.1.4
year = 2004
if(year % 4 == 0 and not (year % 100 == 0 and year % 400 == 0)):
    print(True)
    print ( year, "is a leap year")
else:
    print(year, "is not a leap year")
