class Solution {
    public int longestValidParentheses(String s) {
        

        int n=s.length();
        Stack<Integer> stack = new Stack<>();
        int count=0;

        //For empty stack exception in line 16
        stack.push(-1);
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            if(ch=='('){
                stack.push(i);
            }else{
                stack.pop(); 
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    int len = i-stack.peek();
                    count = Math.max(count,len);
                }
            }
        }
        return count;
        // int n=s.length();
        // Stack<Character> stack = new Stack<>();
        // int count=0;
        // for(char ch : s.toCharArray()){
            
        //     if(ch=='('){
        //         stack.push(ch);
        //     }else{
        //         if(!stack.isEmpty() && stack.peek()=='('){
        //             stack.pop();
        //             count+=2;
        //         }
        //     }
        // }
        // return count;
    }
}