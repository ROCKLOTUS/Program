/*************************************************************************
	# File Name: Ternary.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 10时49分10秒
 ************************************************************************/

public class Ternary{
    public static void main(String args[]){
        int i,k;
        i = 10;
        
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of ");
        System.out.println(i + " is "+k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of ");
        System.out.println(i + " is "+k);
    }
}

