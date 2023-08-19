public class Solution {
    public void Rotate(int[] nums, int k) {
        int[] newArray=new int[nums.Length];
        int l=0;
        if(nums.Length!=1){
            int length=nums.Length;
            int p = k;
            while(p>nums.Length){
                p=p-nums.Length;
            }
            for(int i=p;i>0;i--){
                newArray[l]=nums[nums.Length-i];
                l++;
            }
            for(int i=0;i<(nums.Length-p);i++){
                newArray[l]=nums[i];
                l++;
            }

            for(int i=0;i<nums.Length;i++){
                nums[i]=newArray[i];
            }   
        }   
    }
}
