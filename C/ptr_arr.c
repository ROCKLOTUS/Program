/*************************************************************************
	# File Name: ptr_arr.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时17分55秒
 ************************************************************************/

#include<stdio.h>
int main(void){
    int a[] = { 2,3,4,5,6,7 };
    int *p;
    p = a;
    int index = 0;
    printf("%d,%d\n",p[index],p[index++]);

    return 0;
}
