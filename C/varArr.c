/*************************************************************************
	# File Name: varArr.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时45分37秒
 ************************************************************************/

#include<stdio.h>
int main(void){
    int n = 3;
    int a[n];
    for(int i = 0;i < n;i++){
        a[i] = i;
    }
    for(int i = 0;i < n;i++){
        printf("%d ",a[i]);
    }
    putchar('\n');
    return 0;
}
