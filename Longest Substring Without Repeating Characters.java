class Solution {
    public int lengthOfLongestSubstring(String s) {
        String mainOne="";
        String currentOne="";

        for(int i=0;i<s.length();i++){
            mainOne=mainOne+s.charAt(i);
            if(i!=s.length()-1){
                for(int j=0;j<mainOne.length();j++){
                    if(mainOne.charAt(j)==s.charAt(i+1)){
                        if(mainOne.length()>currentOne.length()){
                            currentOne=mainOne;
                        }
                        i=i-((mainOne.length()-1)-j);
                        mainOne="";
                    }else{
                        if(mainOne.length()>currentOne.length()){
                            currentOne=mainOne;
                        }
                    }
                }
            }else if(mainOne.length()>currentOne.length()){
                currentOne=mainOne;
            }
        }
        System.out.println(currentOne);
        return currentOne.length();
    }
}
