/*************************************************************************
	# File Name: ReturnExample.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 13时46分25秒
 ************************************************************************/

public class ReturnExample{
    public static void main(String args[]){
        boolean t = true;

        System.out.println("Before the return");

        if(t)
          return;
        System.out.println("This won't be executed!");
    }
}
