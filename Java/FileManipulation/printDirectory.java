/*************************************************************************
	# File Name: printDirectory.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月21日 星期一 11时46分09秒
 ************************************************************************/
import java.io.File;

public class printDirectory{
    public static void main(String args[]){
        File f = new File("Test");
        printDir(f);
    }
    public static void printDir(File f){
        System.out.println("d:"+f.getName());
        //get the list of directory f
        System.out.print("\t");
        File[] s = f.listFiles();
        for(int i = 0;i < s.length;i++){
            if(s[i].isDirectory()){
                System.out.print("\t");
                printDir(s[i]);
            }
        }
    }
}

