/*************************************************************************
	# File Name: dec2bin.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时09分29秒
 ************************************************************************/

#include<stdio.h>
void dec2bin(int n);
int main(void){
    dec2bin(8);
}
void dec2bin(int n)
{
    int r;
    r = n % 2;
    if(n > 1){
        dec2bin(n/2);
    }
    putchar('0'+r);
}
