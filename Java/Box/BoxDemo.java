/*************************************************************************
	# File Name: BoxDemo.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月12日 星期六 14时11分34秒
 ************************************************************************/

class Box{
    private double width;
    private double height;
    private double depth;
//    double weight;

    Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    double weight;
    
    //constructor
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeight(BoxWeight bw){
        super(bw);
        weight = bw.weight;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double len,double weight){
        super(len);
        this.weight = weight;
    }

}

public class BoxDemo{
    public static void main(String args[]){         
        BoxWeight box1 = new BoxWeight(10,20,15,34.3);
        BoxWeight box2 = new BoxWeight(2,3,4,0.076);
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(3,1.2);
        BoxWeight box5 = new BoxWeight(box2);

        double vol;

        vol = box1.volume();
        System.out.println("volume of box1 is "+vol);
        System.out.println("weight of box1 is "+box1.weight);
        System.out.println();

        vol = box2.volume();
        System.out.println("volume of box2 is "+vol);
        System.out.println("weight of box2 is "+box2.weight);
        System.out.println();

        vol = box3.volume();
        System.out.println("volume of box3 is "+vol);
        System.out.println("weight of box3 is "+box3.weight);
        System.out.println();

        vol = box4.volume();
        System.out.println("volume of box4 is "+vol);
        System.out.println("weight of box4 is "+box4.weight);
        System.out.println();

        vol = box5.volume();
        System.out.println("volume of box5 is "+vol);
        System.out.println("weight of box5 is "+box5.weight);
        System.out.println();
    }
}
