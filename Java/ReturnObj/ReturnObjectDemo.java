/*************************************************************************
	# File Name: ReturnObjectDemo.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 14时51分35秒
 ************************************************************************/
class Test{
    int a;

    Test(int i ){
        a = i;
    }

    Test increByTen(){
        Test temp = new Test(a+10);
        return temp;
    }
}

public class ReturnObjectDemo{
    public static void main(String args[]){
        Test t1 = new Test(10);
        Test t2;
        t2 = t1.increByTen();

        System.out.println("t1.a "+t1.a);
        System.out.println("t2.a is t1 increByTen: "+t2.a);

        t2 = t2.increByTen();
        System.out.println("t2.a increByTen secondly: "+t2.a);
    }
}

