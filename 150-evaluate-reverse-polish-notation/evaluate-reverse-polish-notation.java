class Solution {
    public int evalRPN(String[] s) {
        
        Stack<Integer> stack = new Stack<>();
        int n=s.length;
        for(int i=0;i<n;i++){
            if(!s[i].equals("+") && !s[i].equals("-") && !s[i].equals("*") && !s[i].equals("/")){
                stack.push(Integer.parseInt(s[i]));
            }else{
                int a=stack.pop();
                int b=stack.pop();
                if(s[i].equals("+")){
                    stack.push(b+a);
                }else if(s[i].equals("-")){
                    stack.push(b-a);
                }else if(s[i].equals("/")){
                    stack.push(b/a);
                }else if(s[i].equals("*")){
                    stack.push(b*a);
                }
            }
        }
        return stack.peek();
    }
}