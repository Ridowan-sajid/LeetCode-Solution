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
//Sieve of Eratosthenes: In this way we assume all value is prime then we will check it by adding the base value. Assume n=6; loop will start from 2. Then in inner 
//loop j=i+i; means 2+2=4;j=i+j; that means we will add 2+j; So, all value which can be divided by 2 they will be count as not prime. this way we can check with
//3,5 etc.
