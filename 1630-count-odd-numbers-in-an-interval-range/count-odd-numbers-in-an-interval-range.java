class Solution {
    public int countOdds(int low, int high) {
        
        int res = high-low+1; //total nos
        if(low%2!=0 && high%2!=0){
            return res/2+1;
        }
        return res/2;
    }
}