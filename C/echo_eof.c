/*************************************************************************
	# File Name: echo_eof.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 17时15分13秒
 ************************************************************************/

#include<stdio.h>
int main(void){
    char ch;
    while((ch = getchar()) != EOF){
        putchar(ch);
    }
    return 0;
}
