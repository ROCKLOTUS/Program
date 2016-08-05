/*************************************************************************
	# File Name: test.c
	# Author: 
	# Mail: 
	# Created Time: 2016年08月02日 星期二 15时43分50秒
 ************************************************************************/

#include<stdio.h>
int main(void){
    int x;
    printf("Please enter a integer:");
    scanf("%d",&x);
    for(int i = 7;i >= 0;i --){
        printf("%d",(x & 1<<i)!=0);
    }
    return 0;
}
