class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        if(nums[i]<nums[j]){
            return nums[i];
        }
        while(i<j){
            int mid=(i+j)/2;
            if(nums[0]<=nums[mid]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return nums[i];
    }
}
