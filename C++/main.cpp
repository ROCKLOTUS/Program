/*************************************************************************
	# File Name: main.cpp
	# Author: 
	# Mail: 
	# Created Time: 2016年11月24日 星期四 17时06分38秒
 ************************************************************************/

#include<iostream>
#include<stdlib.h>
#include<ctime>
#include"dla.h"

using namespace std;
int main(void){
    int i;
    int x,y;

    srand(time(0));
    DLA_Init();

    cerr<<"Stage 1"<<endl;
    setRange(200,200);
    for(i = 0;i < 1000;i++){
        DLA_Gen(&x,&y);
        cout<< x <<"    "<<y<<endl;
    }
    cerr<<"Stage 2"<<endl;
    setRange(400,400);
    for(i = 0;i < 1000;i++){
        DLA_Gen(&x,&y);
        cout<< x <<"    "<<y<<endl;
    }
    cerr<<"Stage 3"<<endl;
    setRange(600,600);
    for(i = 0;i < 1000;i++){
        DLA_Gen(&x,&y);
        cout<< x <<"    "<<y<<endl;
    }
    cerr<<"Stage 4"<<endl;
    setRange(700,700);
    for(i = 0;i < 1000;i++){
        DLA_Gen(&x,&y);
        cout<< x <<"    "<<y<<endl;
    }
    cerr<<"Stage 5"<<endl;
    setRange(900,900);
    for(i = 0;i < 1000;i++){
        DLA_Gen(&x,&y);
        cout<< x <<"    "<<y<<endl;
    }
    cerr<<"Finished"<<endl;
    
    for(int y = 0;y < HEIGHT;y++){
        for(int x = 0;x < WIDTH;x++){
            cout<<s_Grid[y][x]<<"  ";
        }
        cout<<endl;
    }
    return 0;
}

