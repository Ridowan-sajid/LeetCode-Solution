class Solution {
    public int pivotIndex(int[] nums) {
    for(int i=0;i<nums.length;i++){
        int sum1=0;
        int sum2=0;
       for(int j=0;j<i;j++){
           sum1+=nums[j];
       }
       for(int k=i+1;k<nums.length;k++){
           sum2+=nums[k];
       }
       if(sum1==sum2){
           return i;
       }

    }
    return-1;
    }
}




        // int i=0;
        // int j=nums.length-1;

        // while(i<=j){
        //     int sum1=0;
        //     int sum2=0;
        //     int mid = (i+j)/2;

        //     for(int x=0;x<mid;x++){
        //     sum1+=nums[x];
        //     }
        //     for(int x=mid+1;x<nums.length;x++){
        //     sum2+=nums[x];
        //     }
            

        //     System.out.println(nums[mid]+","+sum1+" "+sum2);
        //         if(sum1==sum2){
        //             return mid;
        //         }else if(sum1>sum2){
        //             j=mid-1;
        //         }else if(sum1<sum2){
        //             i=mid+1;
        //         }
            



        // }

        // return -1;
