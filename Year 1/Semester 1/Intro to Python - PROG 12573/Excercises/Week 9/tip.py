def main():
    subtotal = getInput("subtotal")
    tipPercent =  getInput('Tip')
    tip =getTip(tipPercent, subtotal)
    printTotals(subtotal , tipPercent, tip,  (tip + subtotal))
 

def getInput(value):
    userInput = input(f"Enter the {value}: ")
    validate(userInput, value)
    return float(userInput)


def getTip(percentTip, subtotal):
    return (percentTip/100) * subtotal

def validate(userInput, value):
    if userInput.isnumeric() and float(userInput) > 0:
        return
    else:
        getInput(value)

def printTotals(subtotal, tipPercent, tip, total):
    print(f'{subtotal} * {tipPercent/100} \n{subtotal} + {tip:.2f}\n = {total:.2f}')

main()