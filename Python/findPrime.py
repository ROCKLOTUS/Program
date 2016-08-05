#!/usr/bin/env python
# coding=utf-8
#this is a conventional and ordinary method to find the prime
def findPrime(n):
    if n > 2 and n % 2 == 0:
        return False
    elif n > 3 and n % 3 == 0:
        return False
    elif n > 5 and n % 5 == 0:
        return False
    elif n > 7 and n % 7 == 0:
        return False
    else:
        return True

a = list(filter(findPrime,range(2,50)))
print(a)
