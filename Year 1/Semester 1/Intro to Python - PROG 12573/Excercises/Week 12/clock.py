class Clock():
    def __init__(self, hours = 0, minutes = 0 , seconds = 0, milliseconds = 0):
        self.__hours = hours
        self.__minutes = minutes
        self.__seconds = seconds
        self.__milliseconds = milliseconds

    def getHrs(self):
        return self.__hours
    
    def getMins(self):
        return self.__minutes
    
    def getSecs(self):
        return self.__seconds
    
    def getmilli(self):
        return self.__milliseconds
    
    def setHrs(self, hours):
        if hours <= 0:
            self.__hours = hours
        else:
            raise ValueError("Invalid hours")

    def setMins(self, minutes):
        if minutes <= 0:
            self.__minutes = minutes
        else:
            raise ValueError("Invalid Minutes")

    def setSecs(self, seconds):
        if seconds <= 0:
            self.__seconds = seconds
        else:
            raise ValueError("Invalid Seconds")

    def setMilli(self, milliseconds):
        if milliseconds <= 0:
            self.__milliseconds = milliseconds
        else:
            raise ValueError("Invalid Milliseconds")

    def __str__(self):
        return (f'{self.__hours:2d}'
                f'{self.__minutes:2d}'
                f'{self.__seconds:2d}'
                f'{self.__milliseconds:2d}')
    
    
    