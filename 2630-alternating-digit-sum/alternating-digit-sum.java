class Solution {
    public int alternateDigitSum(int num) {
        
        String s = Integer.toString(num);
        int n=s.length();
        int sign=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+= (s.charAt(i)-'0')*sign;
            sign*=-1;
        }   
        return sum;


        
    }
}