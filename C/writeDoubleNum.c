/*************************************************************************
	# File Name: writeDoubleNum.c
	# Author: 
	# Mail: 
	# Created Time: Sun 07 Aug 2016 04:27:50 PM CST
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#define PI 3.1415

void writeDouble(const char *filename){
    FILE *fp;
    if((fp = fopen(filename,"w+"))==NULL){
        printf("ERROR!Failed to open the file %s\n",filename);
        exit(-1);
    }
    //open file successsfully
    for(float i = 0.0;i < PI;i += 0.1){
        fprintf(fp,"%lf,",sin(i));
    }
    //close file 
    fclose(fp);
}

int main(int argc,char *argv[]){
    if(argc != 2){
        printf("ERROR!Usage wirteDoubleNum filename.dat\n");
        return 0;
    }
    writeDouble(argv[1]);
    return 0;
}
