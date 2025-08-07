class Solution {
    public int[] dailyTemperatures(int[] nums) {
        

        int n=nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<n;i++){
            int curr = nums[i];

            while(!stack.isEmpty()){
                int idx=stack.peek();
                int top = nums[idx];

                if(top<curr){
                    res[idx] = i-idx;
                    stack.pop();
                }else{
                    break;
                }
            }
            stack.push(i); 
        }
        
        return res;
        // int n=nums.length;
        // int[] res = new int[n];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
                
        //         if(nums[j]>nums[i]){
        //             res[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        // return res;
    }
}