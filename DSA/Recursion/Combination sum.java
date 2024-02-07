class Solution {
    public void cs(List<List<Integer>> ans, List<Integer> output,int[] candidates, int target,int index){
        int num=0;
        for(int o:output){
            num=num+o;
        }
        if(num==target){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(num>target){
            return;
        }

        for(int i=index;i<candidates.length;i++){
            output.add(candidates[i]);
            cs(ans,new ArrayList<>(output),candidates, target, i);
            output.remove(output.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        cs(ans,output,candidates, target, index);
        return ans;
    }
}
