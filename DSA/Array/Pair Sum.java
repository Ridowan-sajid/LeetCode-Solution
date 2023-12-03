import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> num=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==s){
                    int pair[]={arr[i],arr[j]};
                    num.add(pair);    
                }
            }
        }
       Collections.sort(num,Comparator.comparingInt((int[] ar)->ar[0])
       .thenComparingInt(ar->ar[1]));

        return num;
    }
}
