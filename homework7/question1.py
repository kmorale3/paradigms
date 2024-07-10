#!/usr/bin/env python3

# Katie Morales
# Programming Paradigms Homework 7
# iterator where is the robot

class move_robot:
    def __init__(self,n):
        # initial coordinates (0, 0)
        self.x = 0
        self.y = 0
        # directions 1,2,3,4 = North, East, West, South
        # initial direction North
        self.dir = 1
        # amount to move each time
        self.m = 1
        # iterator and number of times to iterate 
        self.i = 0
        self.n = n
    
    def __iter__(self):
        return self

    def __next__(self):
        # compute n iterations 
        if self.i <= self.n:
            # starting point is (0,0)
            if self.i == 0:
                self.i += 1
                return (self.x,self.y)

            # see which direction we are moving in 
            if   self.dir == 1:
                self.y += self.m 
            elif self.dir == 2:
                self.x += self.m 
            elif self.dir == 3:
                self.y -= self.m
            elif self.dir == 4:
                self.x -= self.m
            
            # increment iterator, amount to move and direction
            self.i  += 1
            self.m  += 1
            self.dir = (self.dir % 4) + 1

            # return tuple of point
            return (self.x,self.y)
        else:
            raise StopIteration()

