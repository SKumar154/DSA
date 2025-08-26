class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        int n=dimensions.length;
        int m=dimensions[0].length;
        double maxDiag = 0;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int l = dimensions[i][0];
            int b = dimensions[i][1];

            double diag = Math.sqrt(l*l + b*b);
            int area = l*b;

            if(diag>maxDiag || (diag==maxDiag && area>maxArea)){
                maxDiag = diag;
                maxArea = area;
            }
        }
        return maxArea;
    }
}