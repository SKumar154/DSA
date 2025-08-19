class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        int n=nums.length;
        long count=0;
        long ans=0;
        for(int i : nums){
            count = (i==0) ? count+1 : 0;
            ans += count;
        }
        return ans;
    }
}