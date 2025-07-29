import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        
        BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);

        BigInteger res = no1.multiply(no2);

        return res.toString();
    }
}