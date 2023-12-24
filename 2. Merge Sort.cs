public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int newLength=m+n;
        int j=0;
        for(int i=m;i<newLength;i++){
            nums1[i]=nums2[j];
            j++;
        }
        Array.Sort(nums1);      
        
    }
}
