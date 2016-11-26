/*************************************************************************
	# File Name: PrintA.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 13时38分58秒
 ************************************************************************/
class ThreadA implements Runnable{
    Thread t;//create a instance of Thread 

    ThreadA(){
        //constructor
        t = new Thread(this,"ThreadA");
        t.start();
    }
    public void run(){
        try{
            for(int i = 0;i < 5;i++){
                System.out.println("A");
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted!");
        }
        System.out.println("Exiting Thread");
    }
}


public class PrintA{
    public static void main(String args[]){
        ThreadA a = new ThreadA(); 
    }
}

