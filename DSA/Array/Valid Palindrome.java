class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char val1=Character.toLowerCase(s.charAt(i));
            char val2=Character.toLowerCase(s.charAt(j));
            if(Character.isLetterOrDigit(val1) && Character.isLetterOrDigit(val2)){
                if(val1==val2){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
            else if(!Character.isLetterOrDigit(val1)){
i++;
            }else if(!Character.isLetterOrDigit(val2)){
j--;
            }
        }

        return true;


    }
}
