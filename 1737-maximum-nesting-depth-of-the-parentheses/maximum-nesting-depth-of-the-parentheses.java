class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(int i : s.toCharArray()){
            if(i=='('){
                count++;
                max=Math.max(max,count);
            }
            else if(i==')'){
                count--;
                max=Math.max(max,count);
            }
        }
        return max;
    }
}