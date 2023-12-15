import java.util.ArrayList;

public class Solution 
{
    public static boolean isPossible(ArrayList<Integer> boards, int k,int mid){
        int result=0;
        int count=1;
        for(int b: boards){
            if(result+b<=mid){
                result+=b;
            }else{
                count++;
                if(count>k || b>mid){
                    return false;
                }
                result=b;
            }
        }
        return true;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int i=0;
        int j=0;
        for(int b : boards){
            j=j+b;
        }
        int res=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(isPossible(boards,k,mid)){
                res=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return res;
    }
}
