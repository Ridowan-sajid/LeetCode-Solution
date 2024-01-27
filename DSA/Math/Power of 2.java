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
            if(ans>Integer.MAX_VALUE/2){ //if we multiply ans*2 and check then it may gives an error but if we check before getting any error thats a good choice.
                return false;
            }
            ans=ans*2;
        }
        return false;
    }
}
