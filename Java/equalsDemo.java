/*************************************************************************
	# File Name: equalsDemo.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月24日 星期四 20时31分42秒
 ************************************************************************/

public class equalsDemo{
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";

        System.out.println(s1+" equals "+s2+"->"+s1.equals(s2));
        System.out.println(s1+" equals "+s3+"->"+s1.equals(s3));
        System.out.println(s1+" equals(ignoreCase) "+s4+"->"+s1.equalsIgnoreCase(s4));
    }
}
