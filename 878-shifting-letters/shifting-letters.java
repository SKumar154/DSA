class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder str = new StringBuilder();
        int n=s.length();
        int m=shifts.length;
        long sum=0;
        for(int i=0;i<m;i++){
            sum += shifts[i];
        }
        for(int i=0;i<n;i++){
            str.append((char)('a' + (s.charAt(i) - 'a' + sum) % 26));
            sum -= shifts[i];
        }
        return str.toString();
    }
}