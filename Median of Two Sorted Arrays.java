class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arrLength=nums1.length+nums2.length;
        int[] mergedArray = new int[arrLength];
        double res=0;
        for(int i=0;i<nums1.length;i++){
            mergedArray[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            mergedArray[(nums1.length)+i]=nums2[i];
        }
        Arrays.sort(mergedArray);
        if(mergedArray.length%2!=0){
            res=(mergedArray[mergedArray.length/2]);

        }else{
            int num1=mergedArray[(mergedArray.length/2)-1];
            int num2=mergedArray[(mergedArray.length/2)];

            res=(double)(num1+num2)/2;
        }
        
        return res;
    }
}
