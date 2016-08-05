#!/usr/bin/env python
# coding=utf-8
import time 
def timeti(func):
    def wrap():
        start = time.clock()
        func()
        end = time.clock()
        print("Elapsed time:",end - start)
    return wrap
