import java.util.* ;
import java.io.*; 
import java.lang.Math;

public class Solution
{
    public static boolean isPossible(ArrayList<Integer> rank, int m,int mid){
        int dishCount=1;

        for(int r : rank){
            int s=1;
            int sr=s*r;
            while(sr<=mid){
                if(dishCount>=m){
                    return true;
                }
                dishCount++;
                s++;
                sr+=s*r;

            }
        }
        return false;
    }
    public static int minCookTime(ArrayList<Integer> rank, int m)
    {
        int i=0;
        int j=(int)Math.pow(2,31);
        //int j=5*(m*(m+1));
        int ans=-1;

        while(i<=j){
            int mid=(i+j)/2;
            if(isPossible(rank,m,mid)){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}
