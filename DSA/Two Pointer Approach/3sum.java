class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<List<Integer>> s=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        for(List<Integer> t : s){
            ans.add(t);
        }
        return ans;
    }
}
