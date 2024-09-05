int_num = 15
float_num = 23.5
str_num = '12.5'
#convert int to string and float
int_num = str(int_num)
print(type(int_num))

int_num = float(int_num)
print(type(int_num))
#convert float to int and string
float_num = int(float_num)
print(type(float_num))

float_num = str(float_num)
print(type(float_num))

#convert string to  float and int
str_num = float(str_num)
print(type(str_num))

str_num = int(float(str_num))
print(type(str_num))
