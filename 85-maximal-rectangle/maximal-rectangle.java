class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int[] nums = new int[matrix[0].length];
        int n=matrix.length;
        if(n==0){
            return 0;
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val = matrix[i][j]-'0';
                if(val==0){
                    nums[j] = 0;
                }else{
                    nums[j]+=val;
                }
            }
            int currArea = largestRectangleArea(nums);
            maxArea = Math.max(maxArea,currArea);
        }
        return maxArea;
        
    }
    public int largestRectangleArea(int[] nums) {
        
        int n=nums.length;
        Stack<Integer> stack = new Stack<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int element = (i==n) ? 0 : nums[i];

            while(!stack.isEmpty() && nums[stack.peek()]>element){
                int h = nums[stack.pop()];
                int ps = (stack.isEmpty()) ? -1 : stack.peek();
                int w = i-ps-1;
                max = Math.max(max,h*w);
            }
            stack.push(i);
        }
        return max==Integer.MIN_VALUE ? 0 : max;
    }
}