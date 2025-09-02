class Solution {
    public int[] asteroidCollision(int[] nums) {
        
        int n=nums.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                stack.push(nums[i]);
            }else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<-nums[i]){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(nums[i]);
                }
                if(stack.peek() == -nums[i]){
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        int i=stack.size()-1;

        while(!stack.isEmpty()){
            res[i--] = stack.pop();
        }
        return res;
    }
}