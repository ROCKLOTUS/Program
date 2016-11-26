/*************************************************************************
	# File Name: Average.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月11日 星期五 23时15分57秒
 ************************************************************************/

public class Average{
    public static void main(String args[]){
        double nums[] = {10.1,11.2,12.3,13.4,14.5};

        double result = 0;
        int i;

        for(i = 0;i < 5;i++){
            result = result + nums[i];
        }
        System.out.println("Average is "+result/5);
    }
}
