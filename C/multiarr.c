/*************************************************************************
	# File Name: multiarr.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时29分51秒
 ************************************************************************/

#include<stdio.h>
int main(void){
    int a[][2] = {{1,2},{2,3},{3,4}};
    int (*p)[2] = a;
    printf("%d\n",p[0][1]);
}
