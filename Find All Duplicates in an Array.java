class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> num=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                map.put(nums[i],map.get(nums[i]+1));
                num.add(nums[i]);
            }else{
                int j=1;
                map.put(nums[i],j);
            }
        }
        return num;

    }
}
