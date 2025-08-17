class Solution {
    public double myPow(double x, int n) {
        long pow=n;
        if(pow<0){
            pow=-pow;
            x=1/x;
        }
        return helper(x,pow);
    }
    public double helper(double num, long pow){
        if(pow==0){
            return 1.00000;
        }
        if(pow==1){
            return num;
        }
        if(pow%2==0){
            return helper(num*num,pow/2);
        }else{
            return num*helper(num*num,pow/2);
        }
    }
}