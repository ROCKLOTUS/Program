/*************************************************************************
	# File Name: StackDemo.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 14时20分39秒
 ************************************************************************/

class Stack{
    int stck[] = new int[10];
    int tos;

    //initialize top - of - stack;
    Stack(){
        tos = -1;
    }
    //push an item onto the stack 
    void push(int item){
        if(tos == 9){
            System.out.println("Stack is full.");
        }
        else
            stck[++tos] = item;
    }

    //pop an item from the stack 
    int pop(){
        if(tos < 0){
            System.out.println("stack is empty.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class StackDemo{
    public static void main(String args[]){
        Stack s1 = new Stack();
        Stack s2 = new Stack();

        for(int i = 0;i < 10;i++){
            s1.push(i);
        }
        for(int i = 10;i < 20;i++){
            s2.push(i);
        }

        System.out.println("stack in s1:");
        for(int i = 0;i < 10;i++){
            System.out.println(s1.pop());
        }

        System.out.println("stack in s2:");
        for(int i = 0;i < 10;i ++){
            System.out.println(s2.pop());
        }
    }
}
