class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int n=nums.length;
        
        boolean asc = true;
        boolean desc = true;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                desc = false;
            }
            if(nums[i]<nums[i-1]){
                asc = false;
            }
            //Detect early if both the asc and desc are false that means array is not monotonic
            if(!asc && !desc){
                return false;
            }
        }
        return asc || desc;
    }
}