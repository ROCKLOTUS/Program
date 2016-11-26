/*************************************************************************
	# File Name: Exec2.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月18日 星期五 20时35分38秒
 ************************************************************************/

public class Exec2{
    public static void main(String args[]){
        int d,a;
        try{
            d = 0;
            a = 42/d;
            System.out.println("This is will not be executed!");
        }catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement");
    }
}
