class Solution {
    public int mySqrt(int x) {
        int i=0;
		int j=x;
		int result=-1;

		while(i<=j){
			int mid=(i+j)/2;
			if((long)mid*mid==(long)x){
				return mid;
			}else if((long)mid*mid>(long)x){
				j=mid-1;
			}
			else{
				result=mid;
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
