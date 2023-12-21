class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix.length-1;

        if(matrix.length==1 && matrix[0].length==1){
            if(matrix[0][0]==target){
                return true;
            }else{
                return false;
            }
        }

        while(i<=j){
            int mid=(i+j)/2;

            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1]){
                int m=0;
                int n=matrix[mid].length;
                while(m<=n){
                    int innerMid=(m+n)/2;
                    if(matrix[mid][innerMid]==target){
                        return true;
                    }else if(matrix[mid][innerMid]<target){
                        m=innerMid+1;
                    }else{
                        n=innerMid-1;
                    }
                }
                return false;
            }
            else if(matrix[mid][0] > target){
                j=mid-1;
            }else if(matrix[mid][matrix[0].length-1] < target){
                i=mid+1;
            }      
        }

        return false;
    }
}
