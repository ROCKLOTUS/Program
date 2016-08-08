#!/usr/bin/env python3.5
# coding=utf-8
import random
import math
class niddle:
    def __init__(self,a,l):
        self.a = a
        self.l = l
        self.angle = 0
        self.pinY = 0
        self.counts = 0
        self.experimentTimes = 100000
    def run(self):
        i = 0
        #1000次实验
        while i < self.experimentTimes :
            self.pinY = random.uniform(-100,100)
            self.angle = random.uniform(0,math.pi)
            #then test
            x = self.pinY // self.a
            if (self.pinY - self.l/2*math.sin(self.angle) < self.a*x) or (self.pinY + self.l/2*math.sin(self.angle)) > self.a*(x+1):
                self.counts += 1
            i += 1
    def result(self):
        print('the result is :',self.counts)
        print("calculate the PI:")
        print("The PI is i is %6.3f"%(2*self.l*self.experimentTimes/(self.counts*self.a)))

a = niddle(5,2.5)
a.run()
a.result()
