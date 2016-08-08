/*************************************************************************
	# File Name: dec2bin.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月26日 星期二 17时07分20秒
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>

int dec2bin(int x){
    if(x==0){
        printf("0");
        return 0;
    }
    else{
        dec2bin(x/2);
        printf("%d",x%2);
    }
}
void dec2bin2(int x){
    for(int i = 7;i >=0;i--){
        printf("%d",(x & (1 << i)) != 0);
}
}
int main(void){
    dec2bin2(8);
    putchar('\n');
}
