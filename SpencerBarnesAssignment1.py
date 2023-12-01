# SpencerBarnesAssignment1.py
# Author: Spencer Barnes
# Date: September 24th 2023 (9/24/2023)

# This takes inputs about a planet including its circumference, name and the gravity acceleration and
# calculates the mass radius and escape velocity, and then prints those to the console


# imports the math function for calculations
import math

# gets input from the user of the planet name
planetName = str(input("Planet Name: "))

# asks the user for the circumference of the planet name user entered
planetCircum = float(input("Circumference of " + str(planetName)+ ": "))

# asks for the gravity acceleration of the planet user specified
planetAccel =  float(input("Gravity acceleration on " + planetName + "(m/s^2): "))

# sets the constant of gravity
GRAVITY = 6.6726e-11 

# calculates the radius of the planet and assigns it to radius
radius = planetCircum/(2*math.pi)

# calculates the mass of the planet and assigns it to mass
mass = ((radius**2)*planetAccel)/GRAVITY

# calculates the escape velocity of the planet and assigns it to escVelocity
escVelocity = math.sqrt((2*GRAVITY*mass)/radius)

# print the radius of the given planet formatted with fstring
print(f"Radius of {planetName +':':18}{radius :.1f}")

# prints the mass of the given planet with formatting
print(f"Mass of {planetName +':':19}{mass :.1e}") 

# prints the escape velocity of the given planet with formatting
print(f"Escape Velocity of {planetName +':':10}{escVelocity :.1f}") 


# Have a good day :)
