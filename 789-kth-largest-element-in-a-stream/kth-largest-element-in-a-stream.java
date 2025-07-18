class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq = new PriorityQueue<>();
        int n=nums.length;
        
        for(int i : nums){
            pq.add(i);

            if(pq.size()>k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        
        if(pq.size()<k){
            pq.add(val);
            return pq.peek();
        }
        pq.add(val);
        pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */