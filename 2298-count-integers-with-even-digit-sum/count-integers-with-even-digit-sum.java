class Solution {
    private int sumOfNumbers(int i){
        int sum=0;
        while(i>0){
            int digit=i%10;
            sum+=digit;
            i=i/10;
        }
        return sum;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            int sum=sumOfNumbers(i);
            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}