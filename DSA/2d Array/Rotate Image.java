class Solution {
    public void rotate(int[][] matrix) {
        int startingRow=0;
        int startingColumn=0;
        int endingRow=matrix.length-1;
        int endingColumn=matrix[0].length-1;
        for(int i=startingRow;i<=endingRow;i++){
            for(int j=startingColumn;j<=endingColumn;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[(matrix.length-1)-j][(matrix[0].length-1)-i];
                matrix[(matrix.length-1)-j][(matrix[0].length-1)-i]=temp;
            }
            endingColumn--;
        }


        int i=0;
        int j=matrix.length-1;
        while(i<j){
            for(int k=0;k<matrix[0].length;k++){
                int temp=matrix[i][k];
                matrix[i][k]=matrix[j][k];
                matrix[j][k]=temp;    
            }
            i++;
            j--;
        }
    }
}
