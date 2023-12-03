import java.util.Arrays;

public class Solution{  

    public static int findUnique(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
          if((i+1)<=(arr.length-1) && arr[i]==arr[i+1]){
              i=i+1;
          }else{
              return arr[i];
          }
        }
        return -1;

    }
}
