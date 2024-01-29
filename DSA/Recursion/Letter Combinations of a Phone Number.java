class Solution {
    public void lc(HashMap<Integer, String> digitList, String singleDigit, List<String> ans, StringBuilder output, int index){
        if(index>singleDigit.length()-1){
            ans.add(output.toString());
            return;
        }
        int valDigit=singleDigit.charAt(index)-'0';
        String getDigit=digitList.get(valDigit);
        for(int i=0;i<getDigit.length();i++){
            output.append(getDigit.charAt(i));
            lc(digitList,singleDigit,ans, output,index+1);
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        HashMap<Integer, String> digitList = new HashMap<Integer, String>();
        List<String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        digitList.put(1,"");
        digitList.put(2,"abc");
        digitList.put(3,"def");
        digitList.put(4,"ghi");
        digitList.put(5,"jkl");
        digitList.put(6,"mno");
        digitList.put(7,"pqrs");
        digitList.put(8,"tuv");
        digitList.put(9,"wxyz");

        lc(digitList,digits, ans,output,0);
        return ans;
    }
}
