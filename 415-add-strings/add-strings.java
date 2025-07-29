import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        
        // int no1=0;
        // for(char c1 : num1.toCharArray()){
        //     no1 = no1 * 10 + (c1 - '0');
        // }

        // int no2=0;
        // for(char c2 : num2.toCharArray()){
        //     no2 = no2 *10 + (c2 - '0');
        // }

        // int res = no1+no2;

        // return Integer.toString(res);

        BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);

        BigInteger res = no1.add(no2);

        return res.toString();
    }
}