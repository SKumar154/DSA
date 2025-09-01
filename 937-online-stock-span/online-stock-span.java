class StockSpanner {

    Stack<Integer> stack;
    ArrayList<Integer> list;

    public StockSpanner() {

        stack = new Stack<>();
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        while(!stack.isEmpty() && list.get(stack.peek())<=price){
            stack.pop();
        }
        int greater = (stack.isEmpty()) ? -1 : stack.peek();
        int curr = list.size()-1;
        int ans = curr - greater;
        stack.push(curr);

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */