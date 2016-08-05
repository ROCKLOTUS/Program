/*************************************************************************
	# File Name: readbin.c
	# Author: 
	# Mail: 
	# Created Time: 2016年08月02日 星期二 15时25分48秒
 ************************************************************************/

#include<stdio.h>
void convert2bin(int x){
    int t = 1;
    for(int i = 31;i >= 0;i--){
        printf("%d",(x & 1<<i)!=0);
        if(t%6==0)
            printf("  ");
        if(t%48==0)
            printf("\n");
        t++;
    }
}

int readbin(const char * filename,const char mode){
    FILE *fp;
    int numCounts = 0;
    int t;

    if((fp = fopen(filename,"rb+")) == NULL){
        printf("Open the file <%s> Failed!\n",filename);
        return 0;
    }
    int c;
    while(!feof(fp)){
        fread(&c,sizeof(int),1,fp);
        if(mode == 'b')
            convert2bin(c);
        else if(mode == 'd'){
            printf("%d",c);
            if(t%6==0)
                printf("  ");
            if(t%48==0)
                printf("\n");
            t++;
        }
        numCounts+=1;
    }
    printf("\nfile size is :%ld\n",numCounts*sizeof(int));
    fclose(fp);

    return 1;
}
int main(int argc,char *argv[]){
    if(argc != 3){
        printf("Error! Usage is : readbin -b[-d] filename\n");
        return 0;
    }
    readbin(argv[2],argv[1][1]);

    return 0;
}
