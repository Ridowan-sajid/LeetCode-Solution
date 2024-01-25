import java.util.*;

public class Main {
    public static boolean isSorted(int arr[],int start,int search){
        if(arr.length-1<start){
            return false;
        }
        if(arr[start]==search) {
            return true;
        }

        return isSorted(arr,start+1,search);
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,5,5,7};
        System.out.println(isSorted(arr,0,3));


    }
}
