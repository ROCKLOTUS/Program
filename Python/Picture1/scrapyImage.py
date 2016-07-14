#!/usr/bin/env python3
# coding=utf-8
import urllib.request
import re
class Scrapy:
    def __init__(self,url):
        self.url = url 
        self.content = ''
    def getPage(self):
        print(self.url)
        page = urllib.request.urlopen(self.url)
        content = page.read()
        content = content.decode('UTF-8')
        self.content = content
    def getImage(self):
        imageList = re.findall(r'src=(".*?.\.jpg)"',self.content)[1:]
        imageList = [image.replace("\"",'') for image in imageList]
        x = 0
        for image in imageList:
            urllib.request.urlretrieve(image,'%s.jpg'%x)
            print('has saved %s pictures'%x)
            x+=1
        print('Done')

def main():
    print('start','='*20)
    html = input('please enter the webpage:')
    print(html)
    scrapy = Scrapy(html)
    print('getPage:')
    scrapy.getPage()
    print('getImage:')
    scrapy.getImage()
    print('succeeful!')

main()



