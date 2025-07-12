class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int count=k;
        int max=Integer.MIN_VALUE;
        while(j<n){
            if(nums[j]==1){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(count>0 && nums[j]==0){
                count--;
                max=Math.max(max,j-i+1);
                j++;
            }
            else {
                if(nums[i]==0){
                    count++;
                }
                i++;
            }
        }
        return max;
    }
}