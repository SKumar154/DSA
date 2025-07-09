class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int index=0;
        int[] result = new int[n-k+1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        while(j<n){
            while(deque.size()>0 && deque.peekLast()<nums[j]){
                deque.pollLast();
            }
            deque.offerLast(nums[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                result[index++] = deque.peekFirst();
                if(nums[i]==deque.peekFirst()){
                    deque.pollFirst();
                }
                i++;
                j++;
            }
        }
        return result;
    }
}