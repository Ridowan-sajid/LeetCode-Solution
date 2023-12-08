class Solution {
    public static int firstPosition(int[] arr, int n, int k){
        int i=0;
        int j=n-1;
        int mid=(i+j)/2;
        int result=-1;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==k){
                result = mid;
                j=mid-1;
            }
            else if(arr[mid]>k){
                j=mid-1;
            }else if(arr[mid]<k){
                i=mid+1;
            }
        }
        return result;

    }

    public static int lastPosition(int[] arr, int n, int k){
        int i=0;
        int j=n-1;
        int mid=(i+j)/2;
        int result=-1;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==k){
                result = mid;
                i=mid+1;
            }
            else if(arr[mid]>k){
                j=mid-1;
            }else if(arr[mid]<k){
                i=mid+1;
            }
        }
        return result;

    }

    public int[] searchRange(int[] nums, int target) {
        int i=firstPosition(nums,nums.length,target);
        int j=lastPosition(nums,nums.length,target);
        int ar[]={i,j};
        return ar;
    }
}
