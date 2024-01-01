class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=i+1;
        int count=1;
        char previousChar=0;
        String newString="";
        
        while(true){
            if(j>chars.length-1){
                if(count>1){
                    newString+=previousChar;
                    newString+=count;
                }else{
                    newString+=chars[i];
                }
                break;
            }
            if(chars[i]==chars[j]){
                count++;
                j++;
                previousChar=chars[i];
            }else if(chars[i]!=chars[j]){
                if(count>1){
                    newString+=previousChar;
                    newString+=count;
                }else{
                    newString+=chars[i];
                }
                count=1;
                i=j;
                j++;
                previousChar=0;
            }
        }
        for(int k=0;k<newString.length();k++){
            chars[k]=newString.charAt(k);
        }
        return newString.length();
    }
}
