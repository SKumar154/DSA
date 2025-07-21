class Solution {
    private int isEven(int i){
        int count=0;
        while(i>0){
            int digit=i%10;
            count++;
            i=i/10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i : nums){
            if(isEven(i)%2==0){
                res++;
            }
        }
        return res;
    }
}