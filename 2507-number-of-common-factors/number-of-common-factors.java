class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int div=1;
        int lower_bound = Math.min(a,b);

        while(div <= lower_bound){
            if(a%div == 0 && b%div == 0){
                count++;
            }
            div++;
        }
        return count;
    }
}