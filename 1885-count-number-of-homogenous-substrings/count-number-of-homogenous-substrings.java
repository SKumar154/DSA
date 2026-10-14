class Solution {
    public int countHomogenous(String s) {
        long mod = 1_000_000_007L;
        int count=1;
        long sum=0;

        sum=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                count=1;
            }
            sum = (sum + count) % mod;
        }
        return (int) sum;
    }
}