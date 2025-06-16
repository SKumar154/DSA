class Solution {
    public int maximumDifference(int[] nums) {
        
        int n=nums.length;
        int min=nums[0];
        int maxDiff=-1;

        for(int i=1;i<n;i++){
            if(nums[i]>min){
                maxDiff = Math.max(maxDiff,nums[i]-min);

            }
            min = Math.min(min,nums[i]);
        }
        return maxDiff;
    }
}