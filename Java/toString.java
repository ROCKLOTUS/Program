/*************************************************************************
	# File Name: toString.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月24日 星期四 20时24分08秒
 ************************************************************************/
class Box{
    float height;
    float width;
    float length;

    Box(float h,float w,float l){
        length = l;
        height = h;
        width = w;
    }
    public String toString(){
        return "Dimensions are "+length+" by "+ width +" by "+  height + ".";
    }
}

public class toString{
    public static void main(String args[]){
        Box b = new Box(2,3,4);
        System.out.println(b);
    }
}
