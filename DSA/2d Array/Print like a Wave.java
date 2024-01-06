import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		int[] newArr=new int[nRows*mCols];

		int k=0;
		for(int i=0;i<mCols;i++){
			for(int j=0;j<nRows;j++){
				if(i%2!=0){
					newArr[k++]=arr[(nRows-1)-j][i];
				}else{
					newArr[k++]=arr[j][i];

				}
			}
		}

		return newArr;
	}
}


