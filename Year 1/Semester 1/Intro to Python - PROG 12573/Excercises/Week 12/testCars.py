import cars

def main():
    make, model, color = getCar().split()
    car = cars.Car(make,model,color)
    car.printSpec()
def getCar():
    make= input("Enter the make:")
    model= input("Enter the model:")
    color = input("Enter the color:")
    return f"{make} {model} {color}"
main()