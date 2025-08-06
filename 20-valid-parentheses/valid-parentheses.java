class Solution {
    public boolean isValid(String s) {


        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(map.containsKey(i)){
                stack.push(i);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                if(map.get(c)!=i){
                    return false;
                }
            }
        }
        return stack.isEmpty();


        
        // Stack<Character> stack = new Stack<>();
        // int c1=0;
        // int c2=0;
        // int c3=0;

        // for(char i : s.toCharArray()){
        //     if(i=='('){
        //         c1++;
        //     }else if(i=='['){
        //         c2++;
        //     }else if(i=='{'){
        //         c3++;
        //     }
        //     stack.push(i);
        // }
        // while(!stack.isEmpty()){
        //     if(stack.peek()==')'){
        //         c1--;
        //     }else if(stack.peek()==']'){
        //         c2--;
        //     }else if(stack.peek()=='}'){
        //         c3--;
        //     }
        //     stack.pop();
        // }
        // if(c1==0 && c2==0 && c3==0){
        //     return true;
        // }
        // return false;
    }
}