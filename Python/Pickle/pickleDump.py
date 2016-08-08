#!/usr/bin/env python
# coding=utf-8
import pickle
data1 = {'a':[1,2.0,3,4+6j],
         'b':['string',u'Unicode String'],
         'c':None}

selfref_list = [1,2,3]
selfref_list.append(selfref_list)

output = open('data.pk1','wb')#二进制写入

#pickle dictionary using protocal 0.ASCII
pickle.dump(data1,output)

#Pickle the list using the highest protocal available
pickle.dump(selfref_list,output,-1)

output.close()