/*************************************************************************
	# File Name: readtxt.c
	# Author: 
	# Mail: 
	# Created Time: 2016年08月02日 星期二 15时04分59秒
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>
int readFile(const char *filename){
    FILE *fp;//declare a file pointer
    if((fp = fopen(filename,"r+")) == NULL){
        printf("The file <%s> cannot be opened!\n",filename);
        return -1;
    }
    char ch;
    while((ch = fgetc(fp)) != EOF){
        putchar(ch);
    }
    fclose(fp);//close the file pointer
    return 0;
}

int main(int argc,char *argv[]){
    if(argc != 2){
        printf("The usage is : readtxt filename.\n");
        return 0;
    }
    //read file 
    readFile(argv[1]);

    return 0;
}
