class Solution {
    public int findKthPositive(int[] nums, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums.length;
        int digit=0;
        int i=0;
        int j=1;
        while(k>0){
            if(i<n && nums[i]==j){
                j++;
                i++;
            }else{
                digit=j;
                j++;
                k--;
            }
        }
        return digit;
    }
}