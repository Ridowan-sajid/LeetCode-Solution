import java.util.*;

public class Main {
    public static int getPivot(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(arr[mid]>arr[0]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int arr[]={8,10,17,2,3,4,5};
        System.out.println(getPivot(arr));


    }
}
