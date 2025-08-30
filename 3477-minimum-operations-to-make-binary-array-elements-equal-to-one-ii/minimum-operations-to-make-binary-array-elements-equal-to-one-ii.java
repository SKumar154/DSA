class Solution {
    public int minOperations(int[] nums) {
        
        int n=nums.length;
        int check = 1;
        int count=0;
        for(int i=0;i<n;i++){
            if(check != nums[i]){
                count++;
                check = nums[i];
            }
        }
        return count;
    }
}