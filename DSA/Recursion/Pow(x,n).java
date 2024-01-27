class Solution {
    public double pow(double x, int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return x;
        }else{
            double ans=pow(x,n/2);
            if(n%2==0){
                return ans*ans;
            }else{
                return x*(ans*ans);
            }
        }
    }

    public double pow2(double x, int n){
        n=Math.abs(n);
        if(n==0){
            return 1;
        }else if(n==1){
            return 1/x;
        }else{
            double ans=pow(x,n/2);
            if(n%2==0){
                return (1/ans)*(1/ans);
            }else{
                return 1/x*((1/ans)*(1/ans));
            }
        }
    }

    public double myPow(double x, int n) {
        double ans=0;
        long l=n;
        if(n<0){
            ans=pow2(x,n);
        }else{
            ans=pow(x,n);
        }

        return ans;
    }
}
