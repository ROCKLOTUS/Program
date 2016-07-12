#!/usr/bin/env python3.5
# coding=utf-8
from urllib import request
import re 

def getHtml(url):
    html = request.urlopen(url)
    page = html.read().decode('utf-8')
    return page 

def getImage(html):
    pat = r'src="(.+?\.jpg)"'
    imageList = re.findall(pat,html)
    x = 0
    for imagehttp in imageList:
        request.urlretrieve(imageList,'%s.jpg'%x)
        x = x+1
html = getHtml("http://tieba.baidu.com/f?kw=%BA%FE%B9%A4&fr")
print(getImage(html))


