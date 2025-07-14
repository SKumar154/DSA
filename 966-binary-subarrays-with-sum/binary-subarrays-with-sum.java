class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums,goal-1);
    }
    private int atMost(int[] nums, int goal){

        int n=nums.length;
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        
        while(j<n){
            sum+=nums[j];

            while(sum>goal && i<=j){
                sum-=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}