/*************************************************************************
	# File Name: const_pointer.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时24分34秒
 ************************************************************************/

#include<stdio.h>
int main(void){
    int a[] = {1,2,3,4};
    int b[] = {5,6,7,8};

    const int *p = a;
    printf("%d\n",p[0]);
    p = b;
    printf("%d\n",p[0]);

    return 0;
}
