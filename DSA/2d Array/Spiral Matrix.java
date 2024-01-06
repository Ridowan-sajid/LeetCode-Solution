class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> newArr=new ArrayList<>();
        int rows=matrix.length;
        int columns=matrix[0].length;
        int count=0;
        int total=rows*columns;
        int startinRow=0;
        int startingColumn=0;
        int endingRow=rows-1;
        int endingColumn=columns-1;
        
        while(count<total){
            for(int j=startingColumn;count<total && j<=endingColumn;j++){
                newArr.add(matrix[startinRow][j]);
                count++;
            }
            startinRow++;
            
            for(int i=startinRow;count<total && i<=endingRow;i++){
                newArr.add(matrix[i][endingColumn]);
                count++;
            }
            endingColumn--;

            for(int i=endingColumn;count<total && i>=startingColumn;i--){
                newArr.add(matrix[endingRow][i]);
                count++;
            }
            endingRow--;

            for(int i=endingRow;count<total && i>=startinRow;i--){
                newArr.add(matrix[i][startingColumn]);
                count++;
            }
            startingColumn++;
        }
        return newArr; 
    }
}
