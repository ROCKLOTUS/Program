/*************************************************************************
	# File Name: printAllFiles.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月20日 星期日 19时58分14秒
 ************************************************************************/
import java.io.File;

public class printAllFiles{
    public static void main(String args[]){
        File f = new File("Test");
        printAllFile(f);
    }
    public static void printAllFile(File f){
        if(f.isDirectory()){
            System.out.println("d:"+f.getName());
            File[] s = f.listFiles();
            for(int i = 0;i < s.length;i++){
                System.out.print("  ");
                if(s[i].isDirectory()){
                    printAllFile(s[i]);
                }
                else
                    System.out.println("  "+s[i].getName());
            }
        }
    }
}
