#!/usr/bin/env python3

# Katie Morales
# Programming Paradigms Activity 9
# A generator is produced by calling a function 
    # containing a yield statement.

def fibonacci(n):
    for i in range(n + 1):
        if   i == 0: yield 0
        elif i == 1: yield 1
        else:
            a = 0
            b = 1
            for k in range(2,i + 1):
                k = a + b
                a = b
                b = k
            yield k
