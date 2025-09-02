class Solution {
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
        // int n=nums.length;
        // int area=0;
        // int max=0;
        // for(int i=0;i<n;i++){
        //     int rs=i;
        //     int ls=i;
        //     int start=i-1;
        //     int end=i+1;
            
        //     while(start >=0 && nums[start]>=nums[i]){
        //         ls = start;
        //         start--;
        //     }
        //     while(end <n && nums[end]>=nums[i]){
        //         rs = end;
        //         end++;
        //     }
        //     area = (rs-ls+1) * nums[i];
        //     max = Math.max(max,area);
        // }
        // return max;
    }
}