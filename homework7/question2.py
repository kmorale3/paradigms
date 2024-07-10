#!/usr/bin/env python3

# Katie Morales
# Programming Paradigms Homework 7
# generator where is the robot

def move_robot(n):
    # initial coordinates (0, 0)
    x = 0
    y = 0
    # directions 1,2,3,4 = North, East, West, South
    # initial direction North
    direction = 1
    # amount to move each time
    m = 1
    for i in range(n + 1):
        # initial coordinate (0,0)
        if   i == 0: yield (x,y)
        else:
            # see which direction we are moving in 
            if   direction == 1:
                y += m 
            elif direction == 2:
                x += m 
            elif direction == 3:
                y -= m
            elif direction == 4:
                x -= m

            # increment amount to move and direction
            m  += 1
            direction = (direction % 4) + 1

            # return tuple of coordinate
            yield (x,y)

