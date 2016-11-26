/*************************************************************************
	# File Name: FindPrime.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 11时15分00秒
 ************************************************************************/

public class FindPrime{
    public static void main(String args[]){
        int num;
        boolean isPrime = true;

        num = 5;
        for(int i = 2;i <(int)Math.sqrt(num) ;i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
