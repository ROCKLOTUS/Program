/*************************************************************************
	# File Name: NewThread.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月18日 星期五 23时24分55秒
 ************************************************************************/

public class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this,"Demo Thread");
        System.out.println("Child thread:"+t);
        t.start();
    }

    public void run(){
        try{
            for(int i = 5;i > 0;i--){
                System.out.println("Child THread:"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child interrupted.");
        }
    }
}
class ThreadDemo{
    public static void main(String args[]){
        new NewThread();

        try{
            for(int i = 5;i > 0;i--){
                System.out.println("Main Thread:"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }
}
