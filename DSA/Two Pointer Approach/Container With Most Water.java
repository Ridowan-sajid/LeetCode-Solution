class Solution {
    public int getHeight(int h1, int h2){
        if(h1>=h2){
            return h2;
        }else{
            return h1;
        }
    }
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;

        while(i<j){
            int minHeight=getHeight(height[i],height[j]);
            if(max<((j-i)*minHeight)){
                max=(j-i)*minHeight;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }

        return max;   
    }
}
