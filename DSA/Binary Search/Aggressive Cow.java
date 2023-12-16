import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static boolean ispossible(int []stalls, int k,int mid){
        int st=-1;
        int cowCount=1;
        for(int s:stalls){
            if(st==-1){
                st=s;
            }else{
                if((s-st)>=mid){
                    cowCount++;
                    if(cowCount==k){
                        return true;
                    }
                    st=s;
                }
            }
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        int i=0;
        int j = Arrays.stream(stalls).max().orElse(0);
        int ans=-1;

        Arrays.sort(stalls);

        while(i<=j){
            int mid=(i+j)/2;
            if(ispossible(stalls,k,mid)){
                ans=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }

        return ans;    
    }
}
