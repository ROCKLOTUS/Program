/*************************************************************************
	# File Name: dla.h
	# Author: 
	# Mail: 
	# Created Time: 2016年11月24日 星期四 16时47分42秒
 ************************************************************************/

#ifndef _DLA_H
#define _DLA_H
const int WIDTH = 1000;
const int HEIGHT = 1000;
static char s_Grid[WIDTH][HEIGHT];
static int s_YRange;
static int s_XRange;
static int s_YCenter;
static int s_XCenter;
static int s_XLow;
static int s_YLow;
static int s_XHigh;
static int s_YHigh;

void DLA_Init(void);
//static inline void walk(int *px,int *py);
//static inline bool isAdjacent(int x,int y);
void DLA_Gen(int *px,int *py);
void setRange(int xRange,int yRange);

#endif
