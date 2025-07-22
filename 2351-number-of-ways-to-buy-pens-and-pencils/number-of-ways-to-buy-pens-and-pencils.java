class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        
        long count=0;
        int rem1=total/cost1;
        int rem2=total/cost2;

        int i=0;
        int j=0;

        while(i<=rem1){
            int remaining=total-(i*cost1);
            count = count + ((remaining/cost2)+1);
            i++;
        }
        return count;
    }
}