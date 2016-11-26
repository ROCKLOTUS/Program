/*************************************************************************
	# File Name: BreakLoop.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 13时33分57秒
 ************************************************************************/

public class BreakLoop{
    public static void main(String args[]){
        for(int i = 0;i < 100;i++){
            if(i==10)
                break;
            System.out.println("i:"+i);
        }
        System.out.println("Loop complete");
    }
}
