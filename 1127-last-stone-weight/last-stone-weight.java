class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> clone = new ArrayList<>();

        for(int stone : stones){
            clone.add(stone);
        }
        for(int i : stones){
            maxHeap.add(i);
        }

        while(maxHeap.size()>1){
            int w1 = maxHeap.poll();
            int w2 = maxHeap.poll();

            if(w1==w2){
                clone.remove(Integer.valueOf(w1));
                clone.remove(Integer.valueOf(w2));
            }else{
                clone.add(w1-w2);
                maxHeap.add(w1-w2);
                clone.remove(Integer.valueOf(w1));
                clone.remove(Integer.valueOf(w2));
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}