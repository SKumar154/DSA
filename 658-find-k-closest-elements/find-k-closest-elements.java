class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        // int n=nums.length;
        // int left=0;
        // int right=n-1;

        // while(right-left>=k){
        //     if(Math.abs(nums[left]-x) > Math.abs(nums[right]-x)){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // List<Integer> res = new ArrayList<>();
        // for(int i=left;i<=right;i++){
        //     res.add(nums[i]);
        // }
        // return res;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            if(k>0){
                minHeap.offer(i);
                k--;
            } else if(Math.abs(minHeap.peek()-x) > Math.abs(i-x)){
                minHeap.poll();
                minHeap.offer(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!minHeap.isEmpty()){
            res.add(minHeap.poll());
        }
        return res;
    }
}