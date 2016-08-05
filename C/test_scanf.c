/*************************************************************************
	# File Name: test_scanf.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 17时52分12秒
 ************************************************************************/

#include<stdio.h>
int main(void){
    int a ;
    char c;
    while(scanf("%d",&a) != 1){
        while((c = getchar()) != '\n'){
            putchar(c);
        }
        putchar(c);
    }
    printf("%d\n",a);

    return 0;
}
