/*************************************************************************
	# File Name: iter.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时02分38秒
 ************************************************************************/

#include<stdio.h>

void up_and_down(int);

int main(void){
    up_and_down(1);
    return 0;
}
void up_and_down(int n)
{
    printf("%d\n",n);
    if(n < 4){
        up_and_down(n+1);
    }
    printf("%d\n",n);
}
