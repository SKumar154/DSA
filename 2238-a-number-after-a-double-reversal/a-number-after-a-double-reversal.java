class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev_1 = 0;
        int temp = num;
        while(num>0){
            int i = num%10;
            rev_1 = rev_1 * 10 + i;
            num /= 10;
        }
        int rev_2 = 0;
        while(rev_1>0){
            int i=rev_1%10;
            rev_2 =rev_2 * 10 + i;
            rev_1 /= 10;
        }

        return rev_2 == temp;
    }
}