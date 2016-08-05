#!/usr/bin/env python
# coding=utf-8
import pickle
pkl_file = open('data.pk1','rb')

data1 = pickle.load(pkl_file)
print(data1)

data2 = pickle.load(pkl_file)
print(data2)

pkl_file.close()
