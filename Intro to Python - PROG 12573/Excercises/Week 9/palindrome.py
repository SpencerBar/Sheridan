# pallin = input('Enter a string to check if it is a pallindrome: ')
# revpallin = ''.join(reversed(pallin))
# if pallin == revpallin:
#     print('it is a pallindrome')


# else:
#     print('it is not a pallindrome')
#     print(revpallin)
def main():
    pallin = input('Enter a string to check if it is a pallindrome: ')
    isItPallin(pallin, isPallin(pallin))


def isPallin(pallin):
    for i in range(int(((len(pallin)/2)))):
        if pallin[i] != pallin[-i-1]:
            return False
    return True

def isItPallin(pallin, isPallin):
    if isPallin:
        print(f'{pallin} is a pallindrome')
    else:
        print(f'{pallin} is not a pallindome')

main()