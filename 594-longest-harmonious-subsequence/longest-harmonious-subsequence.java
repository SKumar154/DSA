class Solution {
    public int findLHS(int[] nums) {

        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int curr=0;
            int next=0;
            for(int j=0;j<n;j++){
                
                if(nums[j] == nums[i]){
                    curr++;
                }else if(nums[j] == nums[i]+1){
                    next++;
                }
            }
            if(curr>0 && next>0){
                max=Math.max(max,curr+next);
            }
        }
        return max;
    }
}