import turtle as t

t.seth(0)
for j in range(4):
    t.setheading(90*j)
    for i in range(1,6):
        t.circle(i*20)
t.done()