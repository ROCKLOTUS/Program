#!/usr/bin/env python3.5
# coding=utf-8
def deco(func):
    print("Before myfunc() called.")
    func()
    print("after myfunc() called.")
    return func

@deco
def myfunc():
    print("myfunc() called.")

myfunc()
myfunc()
