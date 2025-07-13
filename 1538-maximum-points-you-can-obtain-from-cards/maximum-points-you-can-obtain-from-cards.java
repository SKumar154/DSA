class Solution {
    public int maxScore(int[] nums, int k) {
        

        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;


        for(int i=0;i<k;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        int end =n-1;
        for(int j=k-1;j>=0;j--){
            sum-=nums[j];
            sum+=nums[end];
            max=Math.max(max,sum);
            end--;
        }
        return max;
        // int n=nums.length;
        // int i=0;
        // int j=n-1;
        // int sum=0;
        // int sum1=0;
        // int count=k;
        // int r=0;

        // while(r<n){
        //     if(n==k){
        //         sum1+=nums[r];
        //     }
        //     r++;
        // }
        // while(count>0 && i <= j){
        //     if(nums[i]>nums[j]){
        //         sum+=nums[i];
        //         i++;
        //         count--;
        //     }
        //     else if(nums[i]<nums[j]){
        //         sum+=nums[j];
        //         j--;
        //         count--;
        //     }
        //     else if(nums[i]==nums[j]){
        //         sum+=nums[i];
        //         i++;
        //         j--;
        //         count--;
        //     }
        // }
        // return n==k? sum1 : sum ;
    }
}