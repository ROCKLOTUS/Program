#!/usr/bin/env python3
# coding=utf-8
import random 
class Queue:
    def __init__(self,n):
        self.n = n          #initial the scale of the problem
    def conflict(self,state,nextY):
        nextX = len(state)
        for x in range(nextX):
            if state[x] == nextY or abs(nextY - state[x])==nextX - x:#conflict condition
                return True
        return False

    def queue(self,num = 8,state = ()):
        num = self.n
        for pos in range(num):
            if not self.conflict(state,pos):
                if len(state) == num - 1:   #if the element is the last
                    yield (pos,)            #generate the result
                else:
                    for result in self.queue(num,state+(pos,)):      #put the (pos,) into the state and get all the result 
                        yield (pos,)+result

def prettyPrint(solution):
    def line(pos,length = len(solution)):
        return '.'*pos + '#' + '.'*(length-1-pos)
    for i in range(len(solution)):
        print(line(solution[i]))

def main():
    print('='*41)
    print("This is a computer simulating environment\n for solving the eight queues question");
    print('='*41)
    scale = int(input("Please enter the scale of the problem:"))
    Que = Queue(scale)
    solution = Que.queue()
    prettyPrint(random.choice(list(solution)))

main()
