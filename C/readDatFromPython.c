/*************************************************************************
	# File Name: readDatFromPython.c
	# Author: 
	# Mail: 
	# Created Time: Sun 07 Aug 2016 04:57:55 PM CST
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>

typedef struct{
    char name[32];
    int age;
    float weight;
}Person;


void readFromPyton(const char *filename,Person p[]){
    FILE *inFile;
    if((inFile = fopen(filename,"rb+"))==NULL){
        printf("ERROR!Failed to open the File :%s\n",filename);
        exit(-1);
    }
    //read file successfully
    fread(p,sizeof(Person),2,inFile);
    fclose(inFile);
}

int main(int argc,char *argv[]){
    if(argc != 2){
        printf("ERROR!Usage readDatFromPython filename\n");
        return 0;
    }
    Person p[3];
    
    readFromPyton(argv[1],p);
    for(int i = 0;i < 2;i++){
        printf("%s\t%d\t%f\n",p[i].name,p[i].age,p[i].weight);
    }

    return 0;
}
