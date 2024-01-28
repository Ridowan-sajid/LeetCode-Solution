import java.util.*;
import java.io.*; 

class Solution {
    public static void ssq(String str,ArrayList<String> ans,StringBuilder output, int index){
        if(index>str.length()-1){
            if(output.length()>0){
                ans.add(output.toString());
            }
            return;
        }

        //for exclude
        ssq(str,ans,new StringBuilder(output),index+1);

        //for include
        output.append(str.charAt(index));
        ssq(str,ans,new StringBuilder(output),index+1);

    }

    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        int index=0;
        ssq(str,ans,output,index);
        return ans;
    }
}
