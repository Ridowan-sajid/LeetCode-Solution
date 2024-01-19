class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        StringBuilder sum=new StringBuilder();
        int carry=0;
        while(i>=0){
            int temp=0;
            if(i==digits.length-1){
                temp=digits[i]+carry+1;
            }else{
                temp=digits[i]+carry;
            }
            if(temp>9){
                carry=1;
            }else{
                carry=0;
            }
            sum.append(temp%10+"");
            i--;
        }
        if(carry>0){
            sum.append(carry+"");
        }

        int[] ans=new int[sum.length()];
        String reversed=sum.reverse().toString();

        for(int j=0;j<reversed.length();j++){
            ans[j]=Character.getNumericValue(reversed.charAt(j));
        }
        return ans;
    }
}
