#!/usr/bin/env python
# coding=utf-8
import random 
def bubbleSort(A):
    for i in range(1,len(A)):
        key = A[i]
        j = i - 1
        while A[j] > key and j >= 0:
            A[j+1] = A[j]
            j -= 1
        A[j+1] = key
    return A

def merge(A,l,q,r):
    L = A[l:q+1]
    R = A[q+1:r+1]
    x = y = 0
    for i in range(l,r+1):
        if x < len(L) and y < len(R):
            if L[x] < R[y]:
                A[i] = L[x]
                x += 1
            else:
                A[i] = R[y]
                y += 1
        elif x == len(L):
            A[i] = R[y]
            y += 1
        else:
            A[i] = L[x]
            x += 1
    return A
def mergeSort(A,l,r):
    if l < r:
        q = (l+r)//2
        mergeSort(A,l,q)
        mergeSort(A,q+1,r)
        merge(A,l,q,r)
    return A
