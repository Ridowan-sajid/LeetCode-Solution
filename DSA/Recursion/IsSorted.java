import java.util.*;

public class Main {
    public static boolean isSorted(int arr[],int start){
        if(arr.length==0 || arr.length==1 || start>=arr.length-1){
            return true;
        }

        if(arr[start]>arr[start+1]){
            return false;
        }else{
            return isSorted(arr,start+1);
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,5,5,7};
        System.out.println(isSorted(arr,0));


    }
}
