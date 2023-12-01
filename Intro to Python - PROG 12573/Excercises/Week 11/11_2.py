def getInput():
    while True:
        value = input("Enter input:")
        try:
            1/value
            float(value)
            return value
        except ValueError as err:
            print(err)