class Solution {
    public long[] sumOfThree(long num) {

        long[] res = new long[3];
        long i=0;
        long j=1;
        long k=2;
        long sum=0;
        if(num%3==0){  // If 3 numbers sum up to num.... Then the middle element has to be num/3
            j=num/3;
            i=j-1;
            k=j+1;
            sum=(i+j+k);
            if(sum==num){
                res[0]=i;
                res[1]=j;
                res[2]=k;
            }

        }
        return sum==num ? res : new long[0];
    }
}