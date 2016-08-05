/*************************************************************************
	# File Name: virus_attack_memory.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月30日 星期六 18时50分49秒
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>
int kill_memory(void){
    int *p;
    char c = 'y';
    char ch;
    while(c == 'y'){
        printf("Please enter yes/no:");
        scanf("%c",&c);
        while((ch = getchar()) != '\n')
            continue;//eliminate the '\n
        if(c == 'y'){
            printf("Kill memory\n");
            p = (int *)malloc(sizeof(int)*1000*1000*2000);
        }
        else{
            free(p);
            return 0;
        }
    }
}
int main(void){
    printf("Are you ready to test your computer!\n");
    kill_memory();

    return 0;
}
