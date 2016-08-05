#!/usr/bin/env python
# coding=utf-8
def deco(func):
    print("Before myfunc() called.")
    func()
    print("after myfunc() called.")
    return func

def myfunc():
    print("myfunc() called.")

myfunc = deco(myfunc)

myfunc()
myfunc()
