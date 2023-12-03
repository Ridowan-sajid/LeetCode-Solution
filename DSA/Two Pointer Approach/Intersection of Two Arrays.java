class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> newArr=new HashSet<Integer>();
        int i=0;
		int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

		while(i<nums1.length && j<nums2.length){
			if(nums1[i]==nums2[j]){
				newArr.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i]<nums2[j]){
				i++;
			}else {
				j++;
			}	
		}
        int newArr2[]=new int[newArr.size()];	
        int k=0;    
        for(int l:newArr){
            newArr2[k]=l;
            k++;
        }
		return newArr2;
    }
}
