class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((e1,e2)->{
            return e2[0]-e1[0];
        });
        int n=points.length;
        for(int i=0;i<n;i++){
            int[] coordinates= points[i];

            int x=coordinates[0];
            int y=coordinates[1];

            int dist = (x*x)+(y*y);

            minHeap.add(new int[]{
                dist,
                i
            });

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[][] res = new int[k][2];
        int i=0;

        while(i<k){
            int[] element = minHeap.poll();

            int dist=element[0];
            int cordIdx=element[1];

            res[i][0] = points[cordIdx][0];
            res[i][1] = points[cordIdx][1];
            i++;
        }
        return res;
        
    }
}