class Pair{
    int row;
    int col;
    int tm;

    Pair(int r,int c,int t){
        this.row=r;
        this.col=c;
        this.tm=t;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cntFresh=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.offer(new Pair(i,j,0));
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    cntFresh++;
                }
            }
        }

        int time=0;
        int[] arow={-1,0,+1,0};
        int[] acol={0,-1,0,+1};
        int cnt=0;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            int t=p.tm;
            time=Math.max(time,t);
            for(int i=0;i<4;i++){
                int nrow=r + arow[i];
                int ncol=c + acol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.offer(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntFresh) return -1;
        return time;
    }
}