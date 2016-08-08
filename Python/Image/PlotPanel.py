#!/usr/bin/env python3.5
# coding=utf-8
import cv2
import numpy as np 
from matplotlib import pyplot as plt
import time
import threading

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

class threadLine(threading.Thread):
    def __init__(self,paper,startPoint=(0,0),endPoint=(300,300),color=(155,155,155),thickness = 1):
        threading.Thread.__init__(self)
        self.paper = paper
        self.startPoint = startPoint
        self.endPoint = endPoint
        self.color = color
        self.thickness = thickness
        self.k = 0
        self.threadStop = False

    def run(self):
        while not self.threadStop: 
            cv2.line(self.paper,self.startPoint,self.endPoint,self.color,self.thickness);#line
            cv2.imshow('line',self.paper)#show 
            self.k = cv2.waitKey(0)
            if self.k == ord('q'):
                self.stop()

    def stop(self):
        cv2.destroyAllWindows()
        self.threadStop = True
#test code 
#line1 = threadLine()
#line2 = threadLine()
#line1.start()
#time.sleep(2)
#line2.start()
img = whitePaper(500,500)
#line1 = threadLine(img)
line2 = threadLine(img,(10,10),(400,400),(0,255,255),5)
#line1.start()
line2.start()
