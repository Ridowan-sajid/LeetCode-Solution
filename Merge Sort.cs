public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int newLength=m+n;
        int[] arr=new int[newLength];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=m;i<newLength;i++){
            arr[i]=nums2[j];
            j++;
        }
        Array.Sort(arr);
        for(int i=0;i<arr.Length;i++){
            nums1[i]=arr[i];
        }
        
        
    }
}
