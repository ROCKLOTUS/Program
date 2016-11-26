/*************************************************************************
	# File Name: BRRead.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 14时42分14秒
 ************************************************************************/
import java.io.*;

public class BRRead{
    public static void main(String args[]) throws IOExceptio{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters,q to quit.");
        do{
            c = (char)br.read();
            System.out.println(c);
        }while(c != 'q');
    }
}
