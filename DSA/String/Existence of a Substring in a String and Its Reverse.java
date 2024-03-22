class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s2=sb.toString();
        if(s.length()<2){
            return false;
        }



        for(int i=0;i<s.length()-1;i++){
                    int st1=i;
        int st2=i+1;
            for(int j=0;j<s2.length()-1;j++){
                        int f1=j;
        int f2=j+1;
                if(s.charAt(st1)==s2.charAt(f1) && s.charAt(st2)==s2.charAt(f2)){
                   return true;
                }
                f1++;
                f2++;
            }
            st1++;
            st2++;
        }
        return false;
    }
}
