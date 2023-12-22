import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort(int[] arr, int n) {   
        boolean isSorted=false;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int s=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=s;
                    isSorted=true;
                }
            }
            if(isSorted==false){
                    break;
            }
        }

    }

}
