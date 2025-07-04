class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        while(k>str.length()){
            String op = str.toString();
            for(int i=0;i<op.length();i++){
                str.append((char)(op.charAt(i)+1));
            }
        }
        return str.charAt(k-1);
    }
}