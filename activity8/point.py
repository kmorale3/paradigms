#!/usr/bin/env python3

# Katie Morales
# Programming Paradigms Activity 8

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def print(self):
        print(f'({self.x},{self.y})')

def distance(p1, p2):
    ''' This function takes in 2 Point objects and computes the
        Euclidean distance between them. '''
    dx = p2.x - p1.x
    dy = p2.y - p1.y
    d  = ((dx ** 2) + (dy ** 2)) ** 0.5
    return d
