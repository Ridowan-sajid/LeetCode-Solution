class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;

        while(col>=0 && row<=matrix.length-1){
            if(matrix[row][col]==target){
                return true;
            }else if(target>matrix[row][col]){
                row++;
            }else if(target<matrix[row][col]){
                col--;
            }
        }

        return false;
    }
}
