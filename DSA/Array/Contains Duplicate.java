class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nums2=new HashSet<>();
        for(int i:nums){
            if(nums2.add(i)==false){
                return true;
            }
        }
        return false;
    }
}
