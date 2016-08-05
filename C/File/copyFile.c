/*************************************************************************
	# File Name: copyFile.c
	# Author: 
	# Mail: 
	# Created Time: 2016年08月02日 星期二 15时15分03秒
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>

int copyFile(const char *source,const char *dest){
    FILE *inFile;
    FILE *outFile;
    if((inFile = fopen(source,"r+")) == NULL){
        printf("Can not open the <%s>!!!\n",source);
        return 0;
    }
    if((outFile = fopen(dest,"w+")) == NULL){
        printf("Can not open the <%s>!!!\n",dest);
        return 0;
    }
    //open the file successfully
    //read content from the source
    //and at the same time write to the dest file 
    char ch;
    while((ch = fgetc(inFile)) != EOF){
        fputc(ch,outFile);
    }
    fclose(inFile);
    fclose(outFile);
    return 1;
}

int main(int argc,char *argv[]){
    if(argc != 3){
        printf("Error! The Usage is copyFile file1 file2\n");
        return 0;
    }
    if(copyFile(argv[1],argv[2])){
        printf("Copy done!\n");
    }

    return 0;
}
