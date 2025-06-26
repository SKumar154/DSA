class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int i=0;
        int j=0;
        double sum=0;
        double max=Integer.MIN_VALUE;
        double avg=0;
        int n=nums.length;
        while(j<n){
            sum=sum+nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                avg=sum/(j-i+1);
                max=Math.max(max,avg);
                sum=sum-nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}