#!/usr/bin/env python
# coding=utf-8
def YanghuiTriangle(n):
    line = [1]
    x = 0
    while x < n:
        yield line
        line[1:] = [line[i]+line[i-1] for i in range(1,len(line))]
        line.append(1)
        x += 1
def main():
    n = int(input("Enter a integer:"))
    a = YanghuiTriangle(n)
    print("Here is the YanghuiTriangle(%d)\n"%n)
    linum = 1
    for line in a:
        print('#',linum,'\t',line)
        linum += 1
main()
