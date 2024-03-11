import turtle
import random
turtle.bgcolor(random.choice(['black', 'white', 'green', 'orange']))
t = turtle.Turtle()
t.speed(0)
for x in range(20, 400):
    t.color(random.choice(['white','red','blue','green','yellow']))
    t.forward(x)
    t.left(101)
for x in range(20, 400):
    t.color(random.choice(['white','red','blue','green','yellow']))
    t.forward(x)
    t.right(130)


turtle.exitonclick()
