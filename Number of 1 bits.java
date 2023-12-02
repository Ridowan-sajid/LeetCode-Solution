public class Solution {
    public int hammingWeight(int n) {
        String m=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<m.length();i++){
            if((m.charAt(i)&1)!=0){
                count++;
            }
        }
        return count;
    }
}
