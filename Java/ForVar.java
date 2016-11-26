/*************************************************************************
	# File Name: ForVar.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 13时30分18秒
 ************************************************************************/

public class ForVar{
    public static void main(String args[]){
        int i;
        boolean done = false;

        i = 0;
        for(;!done;){
            System.out.println("i is "+i);
            if(i==10)
                done = true;
            i++;
        }
    }
}
