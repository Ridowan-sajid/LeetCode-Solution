class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        int ans=1;
        for(int i=0;i<=30;i++){
            if(ans==n){
                return true;
            }
            ans=ans*2;
        }
        return false;
    }
}