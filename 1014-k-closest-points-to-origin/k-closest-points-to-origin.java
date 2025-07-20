class Solution {
    private int distance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->distance(b)-distance(a));
        
        for(int[] i : points){
            maxHeap.add(i);

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int[][] res = new int[k][2];

        for(int j=0;j<k;j++){
            res[j] = maxHeap.poll();
        }
        return res;        
    }
}