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
