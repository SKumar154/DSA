class Solution {
    public boolean canPlaceFlowers(int[] nums, int num) {
        
        // int n=nums.length;
        // for(int i=1;i<n-1;i++){
        //     if(nums[i]==0 && nums[i-1]!=1 && nums[i+1]!=1){
        //         nums[i]=1;
        //         num--;
        //     }
        // }
        // return num==0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            boolean left = (i==0) || (nums[i-1]==0);
            boolean right = (i==n-1) || (nums[i+1]==0);

            if(left && right && nums[i]==0){
                nums[i]=1;
                num--;
            }
        }
        return num<=0;
    }
}