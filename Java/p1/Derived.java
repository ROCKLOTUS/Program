/*************************************************************************
	# File Name: Derived.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月17日 星期四 22时25分28秒
 ************************************************************************/
package p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("derived constructor");
        System.out.println("n = "+n);
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}

