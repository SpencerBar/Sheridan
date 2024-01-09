import math
def main():
    
    that = allPrime(997)
    writePrimes(that)
def isPrime(num):
    for i in range(2,num//2 + 1):
        
        if num % i  == 0:
            return False
    return True

def allPrime(num):
    primeList = []
    for i in range(2,num+1):
        bool = isPrime(i)
        if bool:
            primeList.append(i)
    return primeList

def writePrimes(primeList):
    with open("primes.txt","w") as txt:
        for i in primeList:
            txt.write(f'{i}\n')
def readPrimes():
    primeList = []
    with open("primes.txt","r") as txt:
        for line in txt:
            primeList.append(line)
        return primeList
            

if __name__ == "__main__":
    main()