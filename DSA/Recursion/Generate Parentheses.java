class Solution {
    public void gp(int n, List<String> ans, StringBuilder output, int index,int left, int right){
        if(index>=n*2){
            ans.add(output.toString());
            return;
        }

        if(left<n){
            output.append('(');
            gp(n,ans,output,index+1,left+1,right);
            output.deleteCharAt(output.length()-1);
        }
        if(left>right){
            output.append(')');
            gp(n,ans,output,index+1,left,right+1); 
            output.deleteCharAt(output.length()-1);      
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        int index=0;
        int left=0;
        int right=0;
        gp(n,ans,output,index,left,right);
        return ans;
    }
}
