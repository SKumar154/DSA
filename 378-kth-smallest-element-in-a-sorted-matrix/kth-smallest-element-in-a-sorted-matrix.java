class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int row=matrix.length;
        int col=matrix[0].length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> values = new ArrayList<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int val = matrix[i][j];
                values.add(val);
            }
        }
        for(int j : values){
            maxHeap.add(j);

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}