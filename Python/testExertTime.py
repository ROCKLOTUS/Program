#!/usr/bin/env python
# coding=utf-8
import sys
from datetime import datetime
import numpy as np

def numpysum(n):
    a = np.arange(n)**2
    b = np.arange(n)**2
    c= a + b
    return c

def pythonsum(n):
    a = list(range(n))
    b = list(range(n))
    c = list()
    for i in range(len(a)):
        a[i] = i**2
        b[i] = i**3
        c.append(a[i]+b[i])
    return c

size = int(sys.argv[1])
##pythonsum
start = datetime.now()
c = pythonsum(size)
delta = datetime.now() - start

print('the last 2 elements of the sum:',c[-2:])
print('pythonsum elapsed time in microseconds:',delta.microseconds)
##numpysum
start = datetime.now()
c = numpysum(size)
delta = datetime.now() - start

print('The last 2 elements of the sum:',c[-2:])
print('numpysum elapsed time in microseconds:',delta.microseconds)
