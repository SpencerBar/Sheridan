# Python program to draw an L shape
import turtle

wn = turtle.Screen()
wn.title('Blue and Red Turtle')
wn.bgcolor('light yellow')
turtle.hideturtle()
turtle.speed(2)


b_t = turtle.Turtle()
b_t.color('blue')
b_t.shape('turtle')
b_t.penup()
b_t.goto(-200, 200)
b_t.pendown()
b_t.goto(-150,200)
b_t.goto(-150,150)
b_t.goto(-200,150)
b_t.goto(-200, 200)
my_t = turtle.Turtle()
my_t.color('green')
my_t.shape('turtle') # make turtle shaped as turtle
my_t.penup() # raise the pen up before moving
my_t.goto(100, 100)
my_t.pendown() # low the pen to get ready for drawing
my_t.right(90)
my_t.forward(100)
my_t.left(90)
my_t.forward(50)

r_t = turtle.Turtle()
r_t.color('red', 'red')
r_t.shape('turtle')
r_t.penup()
r_t.goto(200,-200)
r_t.pendown()
while True:
    r_t.begin_fill()
    r_t.circle(60)
    r_t.end_fill()
    r_t.left()
    r_t.forward(100)
