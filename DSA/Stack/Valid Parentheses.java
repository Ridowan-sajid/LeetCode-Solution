class Solution {
    public boolean isValid(String s) {
        Stack<Character> newStr =new Stack<>();
        for(char str : s.toCharArray()){
            if(!newStr.isEmpty() && ((newStr.peek()=='(' && str==')') || (newStr.peek()=='[' && str==']') || (newStr.peek()=='{' && str=='}'))){
                newStr.pop();
            }else{
                newStr.push(str);
            }
        }
        return newStr.isEmpty();
    }
}
