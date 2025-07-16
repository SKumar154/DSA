class Solution {
    public int[] sortArray(int[] nums) {
        
        int n=nums.length;
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            minHeap.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i] = minHeap.poll();
        }
        return nums;
        

    }
}