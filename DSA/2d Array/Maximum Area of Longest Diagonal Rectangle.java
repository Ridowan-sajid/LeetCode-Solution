class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal=0;
        double lengthRes=0;
        double widthRes=0;
        for(int i=0;i<dimensions.length;i++){
            double length=dimensions[i][0];  
            double width=dimensions[i][1];    
            if(diagonal!=0){
                if(diagonal<Math.sqrt((length*length)+(width*width))){
                    diagonal=Math.sqrt((length*length)+(width*width));
                    lengthRes=length;
                    widthRes=width;
                    //return (int)(length*width);
                }else if(diagonal==Math.sqrt((length*length)+(width*width))){
                    if((lengthRes*widthRes)>(dimensions[i][0]*dimensions[i][1])){
                        //return (int)(dimensions[i-1][0]*dimensions[i-1][1]);
                        lengthRes=lengthRes;
                        widthRes=widthRes;
                    }else{
                        //return (int)(dimensions[i][0]*dimensions[i][1]);
                        lengthRes=dimensions[i][0];
                        widthRes=dimensions[i][1];
                    }
                }
            }else{
                diagonal=Math.sqrt((length*length)+(width*width));
                lengthRes=length;
                widthRes=width;
            }

        }
        return (int)(widthRes*lengthRes);
    }
}
