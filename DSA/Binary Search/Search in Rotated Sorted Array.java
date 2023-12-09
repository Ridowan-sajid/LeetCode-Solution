class Solution {
    public int getPivot(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]>=nums[0]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return i;

    }
    public int binarySearch(int[] nums,int s,int e,int target){
        int i=s;
        int j=e;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=getPivot(nums);
        System.out.println(pivot);

        int ans=-1;
        if(nums[pivot]<=target && target<=nums[nums.length-1]){
            ans=binarySearch(nums,pivot,nums.length-1,target);
        }else{
            ans=binarySearch(nums,0,pivot-1,target);
        }
        
        return ans;
    }
}
