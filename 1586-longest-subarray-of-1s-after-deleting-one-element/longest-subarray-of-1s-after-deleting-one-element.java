class Solution {
    public int longestSubarray(int[] nums) {
        
        int n=nums.length;

        int i=0;
        int j=0;
        int len=0;
        int max=0;
        int count=1;
        int zeros=0;
        while(j<n){
            if(nums[j]==1){
                len++;
                j++;
                max=Math.max(max,len);
            }else if(nums[j]!=1){
                zeros++;
                max=Math.max(max,len);
                if(count>0){
                    count--;
                    j++;
                }else{
                    while(nums[i]!=0){
                        i++;
                    }
                    i++;
                    count++;
                    len=0;
                    j=i;
                }
            }
        }
        return zeros==0 ? n-1 : max;
    }
}