class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        // if(n==0){
        //     return 1;
        // }
        // double ans = Math.pow(10,n) - 9*(n-1);
        // return (int)(ans);
        if(n==0){
            return 1;
        }
        int res=10; // Count of single digit numbers
        int start=9; // Staring of unique digits
        int available=9; //Digits that can be taken

        for(int i=2;i<=n;i++){
            start = start*available;
            res += start;
            available--;
        }
        return res;
    }
}