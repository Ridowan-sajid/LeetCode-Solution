import java.util.* ;
import java.io.*; 
public class Solution {	
	public static void rs(int i, int j, StringBuilder sb){
			if(i>j){
				return ; 
			}
			char temp=sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j,temp);
			i++;
			j--;

			rs(i,j,sb);

	}

	public static String reverseString(String str) {
		int i=0;
		int j=str.length()-1;

		StringBuilder sb=new StringBuilder(str);
		rs(i,j,sb);

		return sb.toString();
	}
}
