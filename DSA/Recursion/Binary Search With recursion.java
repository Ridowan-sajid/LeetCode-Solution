import java.util.*;

public class Main {
    public static boolean binarySearch(int arr[],int start,int end,int search){
            if(start>end){
                return false;
            }
            int mid=(start+end)/2;
            if(arr[mid]==search){
                return true;
            }else if(search<arr[mid]){
                return binarySearch(arr,start,mid-1,search);
            }else{
                return binarySearch(arr,mid+1,end,search);
            }

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,7};
        System.out.println(binarySearch(arr,0,arr.length-1,6));


    }
}
