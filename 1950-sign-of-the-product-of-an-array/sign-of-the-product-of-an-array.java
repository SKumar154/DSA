class Solution {
    public int arraySign(int[] nums) {
        
        int pro=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                pro*=-1;
            }
        }
        if(pro<0){
            return -1;
        }else if(pro>0){
            return 1;
        }
        return 0;
    }
}