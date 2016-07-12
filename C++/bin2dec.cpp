/*************************************************************************
	> File Name: bin2dec.cpp
	> Author: 
	> Mail: 
	> Created Time: 2016年07月05日 星期二 15时19分00秒
 ************************************************************************/

#include<iostream>
#include<string>

using namespace std;
int ord(char);
int bin2dec(string &bin);
bool isBin(char);

int main(void){

    cout<<"Enter the bin string:";
    string bin;
    cin>>bin;
    cout<<"The dec is :"<<bin2dec(bin)<<endl;

    cout<<"Done!\n";
    return 0;
}

int bin2dec(string &bin){
    int sum = 0;
    for(int i = 0;i < bin.length();i++){
        if(isBin(bin[i])){
        sum = sum * 2 + ord(bin[i]);
        }
        else{
            return -1;
        }
    }
    return sum;
}

int ord(char s){
    return s-'0';
}

bool isBin(char s){
    if(ord(s) != 0 && ord(s) != 1)
        return false;
    return true;
}
