public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] arr = new int[2];
int l=0;
        for(int i=0;i<nums.Length;i++){
            if(i==nums.Length-1){
                return null;
            }
            for(int j=1;j<nums.Length;j++){
                if(i!=j){
                        if((nums[i]+nums[j])==target){
                        arr[0]=i;
                        arr[1]=j;
                        l++;
                        break;
                        }
                    }
                    
                }if(l>0){
                        break;
                    }
                
        }
        return arr;
    }
}
