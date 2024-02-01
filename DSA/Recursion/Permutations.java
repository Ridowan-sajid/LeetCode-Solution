class Solution {
    public void pr(int[] nums, List<List<Integer>> ans, int index){
        if(index>=nums.length-1){
            List<Integer> l=new ArrayList<>();
            for(Integer j:nums){
                l.add(j);
            }
            ans.add(l);
            return;
        }

        for(int i=index;i<nums.length;i++){
            //swap
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;

            pr(nums,ans,index+1);

            //swap
            temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int index=0;
        pr(nums,ans,index);
        return ans;
    }
}
