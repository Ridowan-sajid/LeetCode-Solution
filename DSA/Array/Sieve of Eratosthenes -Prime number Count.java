class Solution {
    public int countPrimes(int n) {
        boolean arr[]=new boolean[n];
        Arrays.fill(arr,true);
        if(arr.length>2){
            arr[0]=false;
        }
        else if(arr.length>1){
            arr[1]=false;
        }
        
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]==true){
                count++;
                for(int j=i+i;j<n;j=i+j){
                    arr[j]=false;
                }
            }
        }
        return count;
    }
}
