import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		int i=n-1;
		int j=m-1;
		int sum=0;
		int carry=0;
		List<Integer> arr=new ArrayList<>();

		while(i>=0 && j>=0){
			sum=a[i]+b[j]+carry;
			carry=0;
			if(sum>9){
				carry=sum/10;
				arr.add(sum-10);
			}else{
				arr.add(sum);
			}

			i--;
			j--;
		}
		while(i>=0){
			sum=a[i]+carry;
			carry=0;
			if(sum>9){
				carry=sum/10;
				arr.add(sum-10);
			}else{
				arr.add(sum);
			}
			i--;
		}
		while(j>=0){
			sum=b[j]+carry;
			carry=0;
			if(sum>9){
				carry=sum/10;
				arr.add(sum-10);
			}else{
				arr.add(sum);
			}
			j--;
		}
		if(carry>0){
			arr.add(carry);
		}
		Collections.reverse(arr);
		int k=0;
		int[] arr2=new int[arr.size()];

		for(int l:arr){
			arr2[k]=l;
			k++;
		}

		return arr2;

	}
}
