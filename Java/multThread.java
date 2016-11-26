/*************************************************************************
	# File Name: multThread.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 13时43分12秒
 ************************************************************************/
class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println("New Thread:"+t);
        t.start();
    }

    public void run(){
        try{
            for(int i = 5;i > 0;i--){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+" Interrupted!");
        }
        System.out.println(name+" Exiting!");
    }
}

public class multThread{
    public static void main(String args[]){
        new NewThread("one");
        new NewThread("tow");
        new NewThread("Three");
        System.out.println("Exiting Main THread");
    }
}
