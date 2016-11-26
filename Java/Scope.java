/*************************************************************************
	# File Name: Scope.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月11日 星期五 23时01分17秒
 ************************************************************************/

public class Scope{
    public static void main(String args[]){
        int x;
        x = 10;

        if (x == 10){
            int y = 20;

            System.out.println("x and y :"+x+" "+y);
            x = y * 2;
        }
        System.out.println("x is "+x);
    }
}
