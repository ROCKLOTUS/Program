/*************************************************************************
	# File Name: rewind.c
	# Author: 
	# Mail: 
	# Created Time: 2016年08月02日 星期二 16时03分02秒
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>

void readFile(const char *filename){
    FILE *fp;
    if((fp = fopen(filename,"rb+")) == NULL){
        fprintf(stdout,"ERROR!!!\n");
        exit(-1);
    }
    //read the file twice
    char ch;
    while((ch = fgetc(fp)) != EOF){
        fprintf(stdout,"%c",ch);
    }
    rewind(fp);
    while((ch = fgetc(fp)) != EOF){
        fprintf(stdout,"%c",ch);
    }
}
int main(int argc,char *argv[]){
    if(argc != 2){
        printf("ERROR! USAGE IS:rewind filename!\n");
        return 0;
    }
    readFile(argv[1]);

    return 0;
}
