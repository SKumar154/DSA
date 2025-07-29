class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;

        int[] res = new int[n*2];
        int index=0;
        for(int i=0;i<n;i++){
            res[index++] = nums[i];
        }
        for(int j=0;j<n;j++){
            res[index++] = nums[j];
        }
        return res;
    }
}