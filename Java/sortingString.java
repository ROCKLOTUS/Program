/*************************************************************************
	# File Name: sortingString.java
	# Author: 
	# Mail: 
	# Created Time: 2016年11月24日 星期四 20时38分40秒
 ************************************************************************/

public class sortingString{
    static String arr[] = {
        "Now","is","the","time","for","all","good","men","to","come","to","the","aid","for","their","country"
    };
    public static void main(String args[]){
        String temp;
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
