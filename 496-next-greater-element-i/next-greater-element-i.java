class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
        int n=nums2.length;
        Map<Integer,Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
                stack.push(nums2[i]);
            }else{
                while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    map.put(nums2[i],-1);
                }else{
                    map.put(nums2[i],stack.peek());
                }
                stack.push(nums2[i]);
            }
        }   
        int[] res = new int[nums1.length];
        int index=0;
        for(int key : nums1){
            res[index++] = map.get(key);
        }
        return res; 
    }
}