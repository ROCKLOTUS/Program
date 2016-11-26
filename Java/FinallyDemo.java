/*************************************************************************
	# File Name: FinallyDemo.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月18日 星期五 22时36分52秒
 ************************************************************************/

public class FinallyDemo{
    static void procA(){
        try{
            System.out.println("inside procA");
            throw new RuntimeException("Demo");
        }finally{
            System.out.println("procA's finally");
        }
    }
    static void procB(){
        try{
            System.out.println("inside procB");
            return;
        }finally{
            System.out.println("procB's finally");
        }
    }

    static void procC(){
        try{
            System.out.println("inside procC");
        }finally{
            System.out.println("ProcC's finally");
        }
    }
    public static void main(String args[]){
        try{
            procA();
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}
