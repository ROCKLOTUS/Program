#!/usr/bin/env python3
# coding=utf-8
def flattern(nested):
    try:
        try:
            nested+''
        except TypeError:
            pass
        else:
            raise TypeError
        for sub in nested:
            for element in flattern(sub):
                yield element
    except TypeError:
        yield nested
def main():
    nested = [[[1,2,3],[[4,2,5,2],[34,23]],[2,5,2,7]]]
    print('the nested origin is :',nested)
    print('after flattern:')
    for i in flattern(nested):
        print(i,' ',end='')
    print()

main()
    

