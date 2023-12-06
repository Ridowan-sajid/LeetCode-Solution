import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]==1){
                j++;
            }
            else if(arr[j]==0){
                int l=arr[i];
                arr[i]=arr[j];
                arr[j]=l;
                i++;
                j++;
            }else if(arr[j]==2){
                int l=arr[k];
                arr[k]=arr[j];
                arr[j]=l;
                k--;
            }
        }        
    }
}
