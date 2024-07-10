#!/usr/bin/env python3

# Katie Morales
# Programming Paradigms Homework 6

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print(self):
        print(f'({self.x},{self.y})')

    def __eq__(self, p2):
        if distance(Point(0,0), self) == distance(Point(0,0), p2):
            return True
        else: 
            return False
    def __ge__(self, p2):
        if distance(Point(0,0), self) >= distance(Point(0,0), p2):
            return True
        else: 
            return False
    def __le__(self, p2):
        if distance(Point(0,0), self) <= distance(Point(0,0), p2):
            return True
        else: 
            return False
    def __gt__(self, p2):
        if distance(Point(0,0), self) > distance(Point(0,0), p2):
            return True
        else: 
            return False
    def __lt__(self, p2):
        if distance(Point(0,0), self) < distance(Point(0,0), p2):
            return True
        else: 
            return False


def distance(p1, p2):
    ''' This function takes in 2 Point objects and computes the
        Euclidean distance between them. '''
    dx = p2.x - p1.x
    dy = p2.y - p1.y
    d  = ((dx ** 2) + (dy ** 2)) ** 0.5
    return d