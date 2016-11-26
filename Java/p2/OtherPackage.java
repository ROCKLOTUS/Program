/*************************************************************************
	# File Name: OtherPackage.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月17日 星期四 22时31分40秒
 ************************************************************************/
package p2;
class OtherPackage{
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("other package constructor");

        System.out.println("n_pub = "+p.n_pub);
    }
}

