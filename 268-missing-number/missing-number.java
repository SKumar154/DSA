class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int misno =0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }

        int actualSum = (n*(n+1))/2;
        misno = actualSum - sum;
        return misno;
    }
}