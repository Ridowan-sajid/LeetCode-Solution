class Solution {
    public void subs(int[] nums,List<List<Integer>> ans,List<Integer> output,int index){
        if(index>nums.length-1){
            ans.add(new ArrayList<>(output));
            return;
        }

        //for exclude
        subs(nums,ans,output,index+1);

        //for include
        output.add(nums[index]);
        subs(nums,ans,new ArrayList<>(output),index+1);
        output.remove(output.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        subs(nums,ans,output,index);
        return ans;
    }
}
