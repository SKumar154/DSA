class Solution {
    public int findClosest(int x, int y, int z) {
        
        int per1 = Math.abs(x-z);
        int per2 = Math.abs(y-z);

        int ans=0;

        if(per1>per2){
            ans = 2;
        }else{
            ans = 1;
        }
        return per1==per2 ? 0 : ans;
    }
}