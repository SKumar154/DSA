class Solution {
    private int returnSum(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        
        while(num>=10){
            num=returnSum(num);
        }
        return num;

    }
}