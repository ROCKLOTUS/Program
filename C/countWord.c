/*************************************************************************
	# File Name: countWord.c
	# Author: 
	# Mail: 
	# Created Time: 2016年07月29日 星期五 19时20分27秒
 ************************************************************************/

#include<stdio.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>

int countWord(char a[]){
    int i = 0;
    int inword = 0;
    int wordNum = 0;
    char c;

    while((c = a[i++]) != '\0'){
        //if arive at the head of the word
        if( !isspace(c) && !inword ){
            wordNum++;
            inword = 1;
        }//arrive at the tail of the word
        else if(isspace(c) && inword){
            inword  = 0;
        }
    }
    return wordNum;
}

int main(void){
    char a[40];
    printf("Please enter a sentence\n");
    fgets(a,sizeof(a)/sizeof(char)-1,stdin);
    printf("What you input is :%s\n",a);
    printf("%d\n",countWord(a));

}
