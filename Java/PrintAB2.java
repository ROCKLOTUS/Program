/*************************************************************************
	# File Name: PrintAB2.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 10时55分45秒
 ************************************************************************/
class PrintA extends Thread{

    PrintA(){
        super("PrintA");
        System.out.println("Child A thread"+this);
    }
    public void run(){
        try{
            for(int i = 0;i < 5;i++){
                System.out.println("A");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted!");
        }
        System.out.println("Exiting Thread A");
    }
}
class PrintB extends Thread{

    PrintB(){
        super("PrintB");
        System.out.println("Child B thread"+this);
    }
    public void run(){
        try{
            for(int i = 0;i < 5;i++){
                System.out.println("B");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted!");
        }
        System.out.println("Exiting Thread B");
    }
}

public class PrintAB2{
    public static void main(String args[]){
        PrintA a = new PrintA();
        PrintB b = new PrintB();
        try{
            for(int i = 0;i < 5;i++){
                a.start();
                Thread.sleep(500);
                b.start();
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Exiting Thread Main");
    }
}

