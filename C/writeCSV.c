/*************************************************************************
	# File Name: writeCSV.c
	# Author: 
	# Mail: 
	# Created Time: 2016年08月03日 星期三 16时45分49秒
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#define PI  3.1415

void csvWrite(const char *filename){
    FILE *fp;
    //Open file 
    if((fp = fopen(filename,"w")) == NULL){
        printf("ERROR OPEN THE FILE %s\n",filename);
        exit(-1);
    }

    for(float i = 0.0;i < PI;i += 0.1){
        fprintf(fp,"%f,%f\n",i,sin(i));
    }
    //Close the file 
    fclose(fp);
}
int main(int argc,char *argv[]){
    if(argc != 2){
        printf("ERROR,Usage: writeCSV sine.dat");
        return 0;
    }
    csvWrite(argv[1]);

    printf("Done!\n");
    return 0;
}
