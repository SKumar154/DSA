class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Integer> stack = new Stack<>();
        if(n==1 && k==1){
            return "0";
        }
        if(n==1 && k==0){
            return num;
        }
        for(char ch : num.toCharArray()){
            int i = ch-'0';

            while(k>0 && !stack.isEmpty() && stack.peek()>i){
                stack.pop();
                k--;
            }
            stack.push(i);
        }
        //remove remaining
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        //If nothing left
        if(stack.isEmpty()){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        // Remove leading zeros
        int idx = 0;
        while (idx < sb.length() - 1 && sb.charAt(idx) == '0') {
            idx++;
        }
        String res = sb.substring(idx);

        return res.length() == 0 ? "0" : res;
    }
}