/*************************************************************************
	# File Name: dla.cpp
	# Author: 
	# Mail: 
	# Created Time: 2016年11月24日 星期四 16时49分27秒
 ************************************************************************/

#include<iostream>
#include<stdlib.h>

#include"dla.h"

using namespace std;

void DLA_Init(void){
    int x,y;
    s_XCenter = WIDTH/2;
    s_YCenter = HEIGHT/2;

    for(y = 0;y < HEIGHT;y++){
        for(x = 0;x < WIDTH;x++){
            s_Grid[x][y] = 0;
        }
    }
    s_Grid[s_YCenter][s_XCenter] = 0;
    cout<<s_XCenter<<"  "<<s_YCenter<<endl;
}

static inline void walk(int *px,int *py){
    int w;
    w = rand() % 8;
    switch(w){
        case 0://right
            (*px)++;
            break;
        case 1://left
            (*px)--;
            break;
        case 2://Down
            (*py)--;
            break;
        case 3://up 
            (*py)++;
            break;
        case 4://right-up 
            (*px)++;
            (*py)++;
            break;
        case 5://right-down 
            (*px)++;
            (*py)--;
            break;
        case 6://left-up 
            (*px)--;
            (*py)++;
            break;
        case 7://left down 
            (*px)--;
            (*py)--;
            break;
        default:
            break;
    }
    if(*px > s_XHigh) *px = s_XLow;
    if(*py > s_XHigh) *py = s_YLow;
    if(*px < s_XLow) *px = s_XHigh;
    if(*py < s_YLow) *py = s_YHigh;
}

static inline bool isAdjacent(int x,int y){
    int xx,yy;
    xx = x + 1;
    if(xx > s_XHigh) xx = s_XLow;
    if(s_Grid[y][xx] == 1)return true;//right

    yy = y + 1;
    if(yy > s_YHigh) yy = s_YLow;
    if(s_Grid[yy][xx]==1)return true;//right-up 

    if(s_Grid[yy][x] == 1)return true;//up 

    yy = y - 1;
    if(y < s_YLow) yy = s_YHigh;
    if(s_Grid[yy][xx] == 1)return true;//right-down

    if(s_Grid[yy][x] == 1)return true;//down 

    xx = x - 1;
    if(xx < s_XLow) xx = s_XHigh;
    if(s_Grid[yy][xx] == 1)return true;//left-down 

    if(s_Grid[y][xx] == 1)return true;//left 

    yy = y + 1;
    if(yy > s_YHigh) yy = s_YLow;
    if(s_Grid[yy][xx] == 1)return true;//left-up 

    return false;
}

void DLA_Gen(int *px,int *py){
    *px = rand() % s_XRange + s_XLow;
    *py = rand() % s_YRange + s_YLow;

    while(isAdjacent(*px,*py) == false){
        walk(px,py);
    }
    s_Grid[*py][*px] = 1;
}

void setRange(int xRange,int yRange){
    s_XRange = xRange;
    s_YRange = yRange;

    s_XLow = s_XCenter - xRange/2;
    s_YLow = s_YCenter - yRange/2;
    s_XHigh = s_XCenter + xRange/2;
    s_YHigh = s_YCenter + yRange/2;
}
