/*************************************************************************
	# File Name: ThreadExample.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 10时30分08秒
 ************************************************************************/
class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this,"Child Fork");
        System.out.println("Chinld thread:"+t);
    }
    
    public void run(){
        //executing code
        try{
            for(int i = 0;i < 5;i++){
                System.out.println("Child thread:"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread.");
    }
    void start(){
        t.start();//start code;
    }

}
public class ThreadExample{
    public static void main(String args[]){
        NewThread t = new NewThread();
        t.start();
        try{
            for(int i = 5;i > 0 ;i--){
                System.out.println("Main Thread:"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting ");
    }
}

