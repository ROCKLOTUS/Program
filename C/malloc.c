/*************************************************************************
	# File Name: malloc.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时46分54秒
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>
int main(void){
    int *p;//declare a pointer to the int *
    int n = 3;
    p = (int *)malloc(n*sizeof(int));
    for(int i = 0;i < n;i++){
        p[i] = i;
    }
    for(int i = 0;i < n ;i++){
        printf("%d ",p[i]);
    }
    putchar('\n');
    return 0;

}
