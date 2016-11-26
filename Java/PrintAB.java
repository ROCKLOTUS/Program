/*************************************************************************
	# File Name: PrintAB.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 10时36分27秒
 ************************************************************************/

class PrintA implements Runnable{
    Thread t;

    PrintA(){
        t = new Thread(this,"PrintA");
        System.out.println("Child Thread PRINTA");
    }
    public void run(){
        try{
            for(int i = 0;i < 5;i++){
                System.out.println("A");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting ThreadA");
    }
    void start(){
        t.start();
    }
}

class PrintB implements Runnable{
    Thread t;

    PrintB(){
        t = new Thread(this,"PrintB");
        System.out.println("Child Thread PRINTA");
    }
    public void run(){
        try{
            for(int i = 0;i < 5;i++){
                System.out.println("B");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting ThreadB");
    }
    void start(){
        t.start();
    }
}

public class PrintAB{
    public static void main(String args[]){
        PrintA a = new PrintA();
        PrintB b = new PrintB();
        try{
            for(int i = 5;i > 0;i--){
                a.start();
                Thread.sleep(500);
                b.start();
                Thread.sleep(300);
            }
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted");
        }
    }
}
