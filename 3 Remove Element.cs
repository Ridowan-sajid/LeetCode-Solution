public class Solution {
    public int RemoveElement(int[] nums, int val) {
        int[] arr=new int[nums.Length];
        int count=0;
        int l=0;
        for(int i=0;i<nums.Length;i++){
            if(nums[i]!=val){
                arr[l]=nums[i];
                l++;
            }else{
                count++;
            }
        }

        for(int i=(nums.Length-count);i<nums.Length;i++){
            arr[i]='_';
        }
        for(int i=0;i<nums.Length;i++){
            nums[i]=arr[i];
        }
        return nums.Length-count;
    }
}
