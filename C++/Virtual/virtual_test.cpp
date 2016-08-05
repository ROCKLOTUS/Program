/*************************************************************************
	# File Name: virtual_test.cpp
	# Author: 
	# Mail: 
	# Created Time: 2016年08月03日 星期三 15时08分56秒
 ************************************************************************/

#include<iostream>
using namespace std;
//father class
class VirtualBase{
    public:
    virtual void Demo()=0;//纯虚函数只是一个接口
    virtual void Base(){cout<<"This is father class"<<endl;}
};

//sub class
class SubVirtual:public VirtualBase
{
    public:
    void Demo(){
        cout<<"This is SubVirtual class"<<endl;
    }

    void Base(){
        cout<<"this is subclass Base"<<endl;
    }
};

//instance class and sample
int main(void){
    VirtualBase *inst = new SubVirtual();//mulstate pointer
    inst->Demo();
    inst->Base();

    return 0;
}
