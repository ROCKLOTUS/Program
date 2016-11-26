/*************************************************************************
	# File Name: test.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月19日 星期六 23时16分54秒
 ************************************************************************/
import java.io.File;
public class test{
    public static void main(String args[]){
        File f1 = new File("/home/rock/dirTest");
        File f2 = new File("/home/rock/d.txt");
        File f4 = new File("/home/rock/","1.txt");
        File f3 = new File("/home/rock/Test");
        try{
            //create file only file, and the parent path must be existed! 
            boolean b = f3.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
        }
        //test the existence of the File
        System.out.println("Wheter f3 is exists?:"+f3.exists());
        //get the absolute path of the File
        System.out.println("File f3's absolute path:"+f3.getAbsolutePath());
        //get the fileName of fileObject
        System.out.println("File f3's name:"+f3.getName());
        //get the parent Path Name of fileObject
        System.out.println("File f3's parent path:"+f3.getParent());
        //test whether the file is directory or file 
        System.out.println("file f4 is directory?:"+f4.isDirectory());
        //test whether is File
        System.out.println("File f3 is a file?:"+f3.isFile());
        //get the length of File
        System.out.println("File f3's length is :"+f3.length());
        
        //get all the filesList or Directory lists
        File f6 = new File("Test");
        boolean b1 = f6.mkdir();
        System.out.println(b1);
        //list all files or directorys in the current directory 
        System.out.println("The current path include:");
        String s[] = f6.list();
        for(int i = 0;i < s.length;i++){
            System.out.println(s[i]);
        }

    

    }
}

