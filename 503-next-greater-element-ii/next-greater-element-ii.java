class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        int[] arr = new int[n*2];
        int index=0;
        for(int i=0;i<n;i++){
            arr[index++] = nums[i];
            arr[index+n-1] = nums[i];
        }
        int n1=arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        int idx=0;
        for(int i=n1-1;i>=n;i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()>arr[i]){
                    stack.push(arr[i]);
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    res[idx++] = -1;
                    stack.push(arr[i]);
                }else if(stack.peek()>arr[i]){
                    res[idx++] = stack.peek();
                    stack.push(arr[i]);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int num : res) {
            list.add(num);
        }
        Collections.reverse(list);
        for(int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}