#!/usr/bin/env python3.5
# coding=utf-8
import cv2
import numpy as np 
from matplotlib import pyplot as plt
import time

#time counter decorator
def timeit(t):
    def _timeit(func):
        def __timeit(*args,**kwargs):
            t0 = time.time()
            while time.time() - t0 < t:
                func(*args,**kwargs)
        return __timeit
    return _timeit

def whitePaper(xDim,yDim):
    return np.array([255]*xDim,np.uint8).reshape(-1,xDim)+np.array([0]*yDim,np.uint8).reshape(yDim,1)

@timeit(10)
def line(startPoint=(0,0),endPoint=(100,100),color=(155,155,155),thickness = 1):
    img = whitePaper(500,500)
    color = tuple(reversed(color)
    @timeit(10)
    def plot(str):
        cv2.line(img,(0,0),(499,499),color)
        cv2.imshow(str,img)
        cv2.waitKey(1)
    plot('line')
    cv2.destroyAllWindows()


line((0,0),(400,400))
