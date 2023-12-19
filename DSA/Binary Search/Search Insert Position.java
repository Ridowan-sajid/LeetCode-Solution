class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        if(nums[0]>target){
            return 0;
        } else if(nums[nums.length-1]<target){
            return nums.length;
        }
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target && target<nums[mid+1]){
                return mid+1;
            }
            else if(nums[mid]>target && target>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]<target){
                ans=mid+1;
                i=mid+1;
            }else{
                ans=mid-1;
                j=mid-1;
            }
        }
        return ans;
    }
}
