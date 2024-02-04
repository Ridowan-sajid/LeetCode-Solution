import java.util.* ;
import java.io.*; 
public class Solution {
    public static void fs(int[][] arr,int n, ArrayList<String> ans,int startX, int startY, int[][] visited, StringBuilder output){
        if(startX==n-1 && startY == n-1){
            ans.add(output.toString());
            return;
        }
        
        visited[startX][startY]=1;

        //Up
        int newStartX=startX-1;
        int newStartY=startY;
        if((newStartX>=0 && newStartX<n) && (newStartY>=0 && newStartY<n) && (visited[newStartX][newStartY]==0) && (arr[newStartX][newStartY]==1)){
            output.append("U");
            fs(arr,n,ans,newStartX,newStartY,visited,output);
            output.deleteCharAt(output.length()-1);
        }

        //Down
        newStartX=startX+1;
        newStartY=startY;
        if((newStartX>=0 && newStartX<n) && (newStartY>=0 && newStartY<n) && (visited[newStartX][newStartY]==0) && (arr[newStartX][newStartY]==1)){
            output.append("D");
            fs(arr,n,ans,newStartX,newStartY,visited,output);
            output.deleteCharAt(output.length()-1);
        }

        //Right
        newStartX=startX;
        newStartY=startY+1;
        if((newStartX>=0 && newStartX<n) && (newStartY>=0 && newStartY<n) && (visited[newStartX][newStartY]==0) && (arr[newStartX][newStartY]==1)){
            output.append("R");
            fs(arr,n,ans,newStartX,newStartY,visited,output);
            output.deleteCharAt(output.length()-1);
        }

        //Left
        newStartX=startX;
        newStartY=startY-1;
        if((newStartX>=0 && newStartX<n) && (newStartY>=0 && newStartY<n) && (visited[newStartX][newStartY]==0) && (arr[newStartX][newStartY]==1)){
            output.append("L");
            fs(arr,n,ans,newStartX,newStartY,visited,output);
            output.deleteCharAt(output.length()-1);
        }

        visited[startX][startY]=0;


    }
    public static ArrayList<String> findSum(int[][] arr, int n) {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        int startX=0;
        int startY=0;
        int[][] visited=new int[arr.length][arr[0].length];

        if(arr[startX][startY]==0){
            return ans;
        }

        fs(arr,n,ans,startX,startY,visited,output);
        Collections.sort(ans);
        return ans;
    }
}
