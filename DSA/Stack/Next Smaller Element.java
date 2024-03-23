import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        st.push(-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr.get(i)<=st.peek()){
                st.pop();
            }
            
            ans.add(st.peek());
            st.push(arr.get(i));
            
        }
        Collections.reverse(ans);
        return ans;

    }
}
