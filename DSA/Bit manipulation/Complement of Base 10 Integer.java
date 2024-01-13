class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int val=n;
        int mask=0;
        while(val!=0){
            mask= (mask << 1) | 1;
            val=val >> 1;
        }
        int ans = (~n) & mask;
        return ans;
    }
}
