class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int row=mat.length;
        int col=mat[0].length;

        List<int[]> list = new ArrayList<>();


        for(int i=0;i<row;i++){
            int soldiers=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    break;
                }
                soldiers++;
            }
            list.add(new int[] {
                soldiers,
                i
            });
        }
        Collections.sort(list, (e1,e2) ->{
            if(e1[0]==e2[0]){
                return e1[1]-e2[1];
            }
            return e1[0]-e2[0];
        });

        int[] res = new int[k];
        for(int m=0;m<k;m++){
            res[m] = list.get(m)[1];
        }
        return res;
    }
}