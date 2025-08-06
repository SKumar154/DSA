class Solution {
    public int findGCD(int[] nums) {
        
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int gcd=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int j=1;j<=min;j++){
            if(max%j==0 && min%j==0){
                gcd=Math.max(gcd,j);
            }
        }
        return gcd;
    }
}