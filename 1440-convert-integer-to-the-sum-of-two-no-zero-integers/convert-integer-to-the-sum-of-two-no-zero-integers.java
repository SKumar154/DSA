class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        // if(n%2==0){
        //     res[idx++] = n/2;
        //     res[idx++] = n/2;
        // }else{
        //     res[idx++] = n/2;
        //     res[idx++] = n/2+1;
        // }
        // return res;
        for(int a=1;a<n;a++){
            int b=n-a;
            if(isValid(a) && isValid(b)){
                res[0] = a;
                res[1] = b;
            }
        }
        return res;
    }
    public boolean isValid(int num){
        while(num>0){
            if(num%10==0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}