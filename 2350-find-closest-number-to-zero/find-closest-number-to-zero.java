class Solution {
    public int findClosestNumber(int[] nums) {
        
        int closest=nums[0];
        int minDiff=Math.abs(nums[0]);
        int n=nums.length;

        for(int i=1;i<n;i++){
            int currDiff = Math.abs(nums[i]);
            if(currDiff < minDiff){
                minDiff = currDiff;
                closest = nums[i];
            }else if(currDiff == minDiff){
                if(closest < nums[i]){
                    closest = nums[i];
                }
            }
        }
        return closest;
    }
}