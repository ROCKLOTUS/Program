/*************************************************************************
	# File Name: RecurTest.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 15时01分03秒
 ************************************************************************/
class Recr{
    int values[];

    Recr(int i){
        values = new int[i];
    }

    void displayArray(int i){
        System.out.println("Before recur!");
        if(i == 0)
            return;
        else
            displayArray(i-1);
        System.out.println("["+(i-1)+"]"+"="+values[i-1]);
    }
}

public class RecurTest{
    public static void main(String args[]){
        Recr r = new Recr(10);

        for(int i = 0;i < 10;i++){
            r.values[i] = i;
        }

        r.displayArray(10);
    }
}

