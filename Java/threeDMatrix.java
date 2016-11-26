/*************************************************************************
	# File Name: threeDMatrix.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月11日 星期五 23时24分14秒
 ************************************************************************/

public class threeDMatrix{
    public static void main(String args[]){
        int threeD[][][] = new int[3][4][5];
        int i,j,k;

        for(i = 0;i < 3;i++)
            for(j = 0;j < 4;j++)
                for(k = 0;k < 5;k++)
                    threeD[i][j][k] = i*j*k;

        for(i = 0;i < 3;i++){
            for(j = 0;j < 4;j++){
                for(k = 0;k < 5;k++){
                    System.out.print(threeD[i][j][k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
