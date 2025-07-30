class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i:nums){
            max=Math.max(i,max);
        }

        int maxL=0;
        int curr=0;
        for(int i:nums){
            if(i==max){
                curr++;
            }else{
                maxL=Math.max(maxL,curr);
                curr=0;
            }
        }
        return Math.max(maxL,curr);
    }
}