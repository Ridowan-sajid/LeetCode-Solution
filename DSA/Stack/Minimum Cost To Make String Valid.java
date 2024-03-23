import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMinimumCost(String str) {
        Stack<Character> st=new Stack<>();
        if(str.length()%2!=0) return -1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }else{
                if(!st.empty() && st.peek()=='{'){
                    st.pop();
                }else{
                    st.push(str.charAt(i));
                }
            }
        }

        int left=0;
        int right=0;

        while(!st.isEmpty()){
            if(st.peek()=='{'){
                left++;
            }else{
                right++;
            }
            st.pop();
        }

        return (left+1)/2+(right+1)/2;
    }
}
