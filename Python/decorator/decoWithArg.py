#!/usr/bin/env python3.5
# coding=utf-8
def deco(arg):
    def _deco(func):
        def __deco(*args,**kwarg):
            print("before %s called [%s]."%(func.__name__,arg))
            func(*args,**kwarg)
            print("after %s called [%s]."%(func.__name__,arg))
        return __deco
    return _deco

#more a layer wrapper
#decorator the function
@deco("mymodule")
def myfunc(a,b):
    print("myfunc(%s,%s) called."%(a,b))
    return a+b

@deco("module2")
def myfunc2(a,b,c):
    print("myfunc2(%s,%s,%s) called."%(a,b,c))
    return a+b+c

myfunc(2,3)
myfunc2(1,2,3)

