public class Solution {
    public int RemoveDuplicates(int[] nums) {
         int c=0;
        for(int i=0;i<nums.Length;i++){
            if(nums[i]!=Int32.MaxValue){
                for(int j=i+1;j<nums.Length;j++){
                    if(i+1!=j){
                        if(nums[i]==nums[j]){
                        nums[j]=Int32.MaxValue;    
                        }
                    }
                   
                }
            }
        }

        for(int i=0;i<nums.Length;i++){
            if(nums[i]!=Int32.MaxValue){
                nums[c]=nums[i];
                c++;
            }
        }

        return c;
    }
}
