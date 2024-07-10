#!/usr/bin/env python3

# Katie Morales
# Programming Paradigms Activity 9

# iterators are implemented as classes

class fibonacci:
    def __init__(self,n):
        self.i = 0
        self.n = n
    
    def __iter__(self):
        return self

    def __next__(self):
        while self.i <= self.n:
            i = self.i 
            self.i += 1
            if   i == 0: return 0
            elif i == 1: return 1
            else:
                a = 0
                b = 1
                for k in range(2,i + 1):
                    k = a + b
                    a = b
                    b = k
                return(k)
        else:
            raise StopIteration()

for v in fibonacci(6):
    print(v)