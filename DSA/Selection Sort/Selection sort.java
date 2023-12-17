import java.util.* ;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int[] arr={9,2,3,5,1,4,8,7};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
