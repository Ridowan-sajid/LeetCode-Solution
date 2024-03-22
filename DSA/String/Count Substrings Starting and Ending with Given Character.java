class Solution {
    public long countSubstrings(String s, char c) {
        int count=0;
        for(char i:s.toCharArray()){
            if(i==c){
                count++;
            }
        }
        long ans=0;
        for(int i=count;i>0;i--){
            ans=ans+i;
        }
        return ans;
    }
}
