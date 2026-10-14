class Solution {
    public int numSub(String s) {
        long mod = 1_000_000_007L;
        long res = 0;
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
                res = (res + count) % mod;
            }else{
                count=0;
            }
        }
        return (int) res;
    }
}