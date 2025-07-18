class Solution {
    public int lastStoneWeight(int[] stones) {
        
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // ArrayList<Integer> clone = new ArrayList<>();

        // for(int stone : stones){
        //     clone.add(stone);
        // }
        // for(int i : stones){
        //     maxHeap.add(i);
        // }

        // while(maxHeap.size()>1){
        //     int w1 = maxHeap.poll();
        //     int w2 = maxHeap.poll();

        //     if(w1==w2){
        //         clone.remove(Integer.valueOf(w1));
        //         clone.remove(Integer.valueOf(w2));
        //     }else{
        //         clone.add(w1-w2);
        //         maxHeap.add(w1-w2);
        //         clone.remove(Integer.valueOf(w1));
        //         clone.remove(Integer.valueOf(w2));
        //     }
        // }
        
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // for(int i : stones){
        //     maxHeap.offer(i);
        // }
        // while(maxHeap.size()>1){
        //     int w1 = maxHeap.poll();
        //     int w2 = maxHeap.poll();

        //     if(w1!=w2){
        //         maxHeap.offer(w1-w2);
        //     }
        // }
        // if(maxHeap.size()==0){
        //     return 0;
        // }
        // return maxHeap.peek();

        int n=stones.length;
        Arrays.sort(stones);
        for(int i=n-1;i>0;i--){
            stones[i-1]=stones[i]-stones[i-1];
            Arrays.sort(stones);
        }
        return stones[0];
    }
}