class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int n=nums.length;
        int given=k;
        
        int i=0;
        int j=0;
        int count=0;
        int tempCount=0;

        while(j<n){
            if(nums[j]%2==1){
                given--;
                tempCount=0;
            }
            j++;
            while(given==0 && i<=j){
                tempCount++;
                if(nums[i]%2==1){
                    given++;
                }
                i++;
            }
            count +=tempCount;
        }
        return count;
    }
}