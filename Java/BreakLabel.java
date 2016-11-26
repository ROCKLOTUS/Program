/*************************************************************************
	# File Name: BreakLabel.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 13时36分47秒
 ************************************************************************/

public class BreakLabel{
    public static void main(String args[]){
        boolean t = true;
first://break label
        {
            second:
            {
third:{
          System.out.println("Before the break;");
          if(t)
              break second;
          System.out.println("This won't be executed!");
}
            }

        }
    }
}
