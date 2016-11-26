/*************************************************************************
	# File Name: nestTry.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月18日 星期五 20时46分36秒
 ************************************************************************/

public class nestTry{
    public static void main(String args[]){
        try{
            int a = args.length;

            int b = 42/a;

            System.out.println("a:"+a);
            try{
                //nested try
                if(a==1)
                    a = a/(a-a);
                if(a==2){
                    int c[] = {1};
                    c[42] = 32;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of bounds:"+e);
            }
            System.out.println("Hello world!\n");
        }catch(ArithmeticException e){
            System.out.println("Divide by 0:"+e);
        }
    }
}

