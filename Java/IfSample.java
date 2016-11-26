/*************************************************************************
	# File Name: IfSample.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月11日 星期五 13时16分15秒
 ************************************************************************/

public class IfSample{
    public static void main(String args[]){
        int x, y;

        x = 10;
        y = 20;

        if ( x < y )
            System.out.println("x is less than y");

        x = x*2;
        if ( x == y ){
            System.out.println("x now is equal y");
        }

        x = x * 2;
        if ( x > y )
            System.out.println("x now is greater than y");

        if (x == y){
            System.out.println("You won't see this");
        }
    }
}

