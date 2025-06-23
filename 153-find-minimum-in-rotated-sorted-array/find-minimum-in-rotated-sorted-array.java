class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        
        for(int num : nums){
            min=Math.min(min,num);
        }
        return min;

    }
}