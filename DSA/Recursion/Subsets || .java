class Solution {
    public void sd(int[] nums,Set<List<Integer>> ans,List<Integer> output,int index){
        if(index>nums.length-1){
            Collections.sort(output);
            ans.add(new ArrayList(output));
            return;
        }
        //for exclude
        sd(nums,ans,output,index+1);

        //for include
        output.add(nums[index]);
        sd(nums,ans,new ArrayList<>(output),index+1);
        output.remove(output.size()-1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        sd(nums,ans,output,index);
        List<List<Integer>> l=new ArrayList<>(ans);
        return l;
    }
}
