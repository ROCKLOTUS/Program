#!/usr/bin/env python3
# coding=utf-8
class SeqIterator:
    def __init__(self,n):
        self.value = 0
        self.limit = n
    def __next__(self):
        self.value += 1
        if self.value > self.limit:
            raise StopIteration
        return self.value
    def __iter__(self):
        return self

def main():
    print("produce a sequence of 10:")
    a = SeqIterator(10)
    for i in a:
        print(i,' ',end='')
    print()

main()

