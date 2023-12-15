import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPossible(int n,int m,int[] time,int mid){
        int count=1;
        int sum=0;

        for(int k:time){
            if(sum+k<=mid){
                sum+=k;
            }else{
                count++;
                if(count>n || k>mid){
                    return false;
                }
                sum=k;
            }
        }
        return true;
    }
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        int i=0;
        int j=0;
        for(int t:time){
            j+=t;
        }

        int sum=0;
        int count=1;
        int ans=-1;

        while(i<=j){
            int mid=(i+j)/2;

            if(isPossible(n,m,time,mid)){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }            
        }
        return ans;
    }
}
