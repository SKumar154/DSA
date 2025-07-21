class Solution {
    private int numberLoop(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum+= digit*digit;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        while(n!=1 && !map.containsKey(n)){
            map.put(n,1);  
            n=numberLoop(n);
        }
        return n==1;
    }
}