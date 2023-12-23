import java.util.* ;
import java.io.*; 

public class Solution {

	public static void insertionSort(int n , int[] arr) {
		for(int i=1;i<n;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0){
				if(arr[j]>temp){
					arr[j+1]=arr[j];
				}else{
					break;
				}
				j--;
			}
			arr[j+1]=temp; //why arr[j+1] instead of arr[j]? because inside while loop, 
			               //for break the loop we need to increase j one more time, then j converted to j+1;
		}
	}
}
