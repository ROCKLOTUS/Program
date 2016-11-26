/*************************************************************************
	# File Name: SamePackage.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月17日 星期四 22时27分32秒
 ************************************************************************/
package p1;

class SamePackage{
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same package constructor");
        System.out.println("n = "+p.n);

        //System.out.println("n_pri = "+p.n_pri); //can only in class
        System.out.println("n_Pro = "+p.n_pro);
        System.out.println("n_pul = "+p.n_pub);
    }
}

