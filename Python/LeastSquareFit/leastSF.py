#!/usr/bin/env python
# coding=utf-8
import numpy as np
from scipy.optimize import leastsq
import pylab as pl

def func(x,p):
    """
    数据拟合所用的函数A*sin(2*pi*k*x+theta)
    """
    A,k,theta = p
    return A*np.sin(2*np.pi*k*x+theta)

def residuals(p,y,x):
    """
    实验数据x,y和拟合函数之间的差值，p为拟合所需要找到的系数
    """
    return y - func(x,p)

x = np.linspace(0,-2*np.pi,100)
A,k,theta = 10,0.34,np.pi/6 #真实数据函数参数
y0 = func(x,[A,k,theta])     #真是数据
y1 = y0+2*np.random.randn(len(x))#带噪声的数据

p0 = [7,0.2,0]#第一次猜测到的拟合参数

plsg = leastsq(residuals,p0,args=(y1,x))

print(u'真实参数:',[A,k,theta])
print(u'拟合参数:',plsg[0])

pl.plot(x,y0,label = u'真实参数')
pl.plot(x,y1,label = u'带噪声数据')
pl.plot(x,func(x,plsg[0]),label = u'拟合数据')

pl.legend()
pl.show()
