import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger no1 = new BigInteger(a,2);
        BigInteger no2 = new BigInteger(b,2);

        BigInteger res = no1.add(no2);

        String ans = res.toString(2);
        return ans;
    }
}