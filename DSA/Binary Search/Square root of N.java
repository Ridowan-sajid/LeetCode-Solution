import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		long i=0;
		long j=N;
		int result=-1;

		while(i<=j){
			long mid=(i+j)/2;
			if((mid*mid)==N){
				result=(int)mid;
				return result;
			}else if((mid*mid)>N){
				//result=(int)mid;
				j=mid-1;
			}
			else{
				result=(int)mid;
				i=mid+1;
			}

		}
		return result;
	}
}
//Why we just add result in ((mid*mid)<N), not for other one.
//Because we can take the lower value from exact value but
//we can't take the higher value, ((mid*mid)>N) for this condition
//result could lead us to a higher value compare to 
//exact value 
