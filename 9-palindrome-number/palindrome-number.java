class Solution {
    public boolean isPalindrome(int n) {
        int check = n;
        int temp = 0;

        while(n>0){
            int i = n%10;
            temp = temp*10 + i;
            n = n / 10;
        }
        return check == temp;
        
    }

}