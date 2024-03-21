import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static boolean findRedundantBrackets(String s) 
    {
        Stack<Character> st=new Stack<>();
        boolean isRedundent=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
               st.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(st.peek()=='(') return true;
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }
        }
        return false;

    }
}
