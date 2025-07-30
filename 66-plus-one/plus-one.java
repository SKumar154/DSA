class Solution {
    public int[] plusOne(int[] nums) {
        
        int n=nums.length;

        for(int i=n-1;i>=0;i--){
            if(nums[i]==9){
                nums[i]=0;
            }else{
                nums[i]++;
                return nums;
            }
        }
        nums = new int[n+1];
        nums[0]=1;
        return nums;
    }
}