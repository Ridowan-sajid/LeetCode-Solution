import java.util.* ;
import java.io.*; 
public class Solution {

    public static boolean check(int i,int j,String binaryRe){
            if(i>j){
                return true;
            }
            if(binaryRe.charAt(i)!=binaryRe.charAt(j)){
                return false;
            }else{
                i++;
                j--;
                return check(i,j,binaryRe);
            }

    }

    public static boolean checkPalindrome(long N) {
        String binaryRe=Long.toBinaryString(N);
        int i=0;
        int j=binaryRe.length()-1;
        return check(i,j,binaryRe);
    }

}
