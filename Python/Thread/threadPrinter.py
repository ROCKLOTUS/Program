#!/usr/bin/env python3.5
# coding=utf-8
import threading
import time

class threadPrint(threading.Thread):
    def __init__(self,ch,interval):
        threading.Thread.__init__(self)
        self.ch = ch
        self.interval = interval
        self.threadStop = False

    def run(self):
        while not self.threadStop:
            print(self.ch)
            time.sleep(self.interval)

    def stop(self):
        self.threadStop = True

a = threadPrint('A',2)
b = threadPrint('B',2)
a.start()
time.sleep(1)
b.start()
time.sleep(6)
a.stop()
b.stop()
