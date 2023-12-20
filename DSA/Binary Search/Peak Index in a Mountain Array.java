class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int mid=(i+j)/2;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                i=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                j=mid;
            }
        }
        return -1;
    }
}


/***In Leetcode the question is a little bit different also the answer.**/

class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        if(nums.length==1){
            return 0;
        }
        while(i<=j){
            int mid=i+(j-i)/2;
            if((mid+1)>=nums.length || (mid-1)<0){
               if((mid-1)<0){
                if(nums[mid]<nums[mid+1]){
                    return mid+1;
                }
               }
                return mid;
            }
            else{
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]>nums[mid-1]){
                    i=mid+1;
                }else if(nums[mid]>nums[mid+1]){
                    j=mid-1;
                }else if(nums[mid]<nums[mid-1]){
                    j=mid-1;
                }
            }

        }
        return ans;
    }
}
