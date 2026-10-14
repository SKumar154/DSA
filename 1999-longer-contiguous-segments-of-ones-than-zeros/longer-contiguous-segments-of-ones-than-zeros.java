class Solution {
    public boolean checkZeroOnes(String s) {
        int count_0 = 0;
        int count_1 = 0;
        int max_0 = 0;
        int max_1 = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                count_1++;
                max_1 = Math.max(max_1,count_1);
                count_0 = 0;
            }else{
                count_0++;
                max_0 = Math.max(max_0,count_0);
                count_1 = 0;
            }
        }
        return max_1 > max_0;
    }
}