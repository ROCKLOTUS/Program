/*************************************************************************
	# File Name: PriorityDemo.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 13时54分42秒
 ************************************************************************/
class clicker implements Runnable{
    int click = 0;
    Thread t;
    private volatile boolean running = true;

    public clicker(int p){
        t = new Thread(this);
        t.setPriority(p);
    }
    public void run(){
        while(running){
            click++;
        }
    }
    public void stop(){
        running = false;
    }
    public void start(){
        t.start();
    }
}
public class PriorityDemo{
    public static void main(String args[]){
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        clicker hi = new clicker(Thread.NORM_PRIORITY+3);
        clicker lo = new clicker(Thread.NORM_PRIORITY-3);

        lo.start();
        hi.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted!");
        }
        lo.stop();
        hi.stop();

        try{
            hi.t.join();
            lo.t.join();
        }catch(InterruptedException e){
            System.out.println("InterruptedException caught");
        }
        System.out.println("Low-Priority thread:"+lo.click);
        System.out.println("High-Priority thread:"+hi.click);
    }
}

