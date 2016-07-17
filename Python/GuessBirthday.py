#!/usr/bin/env python
# coding=utf-8
from functools import reduce
#package management

def dValue():
    d = dict(zip((1,2,3,4,5),([],[],[],[],[])))
    for i in range(1,32):
        s = '%05d'%int(bin(i)[2:],10)
        for j in range(5):
            if s[j] == '1':
                d[j+1].append(i)
    return d
#produce the d value

def guessBirthday():
    d = dict()
    d = dict(dValue())
    birthday = list()
    for i in range(5):
        print()
        print('%d line number:\nThe number:'%(i+1),d[i+1],'\n')
        s = input('If your birth day in it,print Yes:')
        if s == 'yes' or s == "Yes":
            birthday.append(1)
        elif s == 'no' or s == 'No':
            birthday.append(0)
        else:
            return "Error"
    def binToDec(binList):
        def func1(a,b):
            return 2*a+b
        return reduce(func1,binList)
    print('Your birth day is :',binToDec(birthday))

#guess birthday
guessBirthday()


