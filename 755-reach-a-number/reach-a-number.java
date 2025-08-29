class Solution {
    public int reachNumber(int target) {
        
        int num=0;
        int steps=0;

        target = Math.abs(target);

        while(num < target){
            steps++;
            num+=steps;
        }
        if(num==target){
            return steps;
        }
        int diff = num - target;
        while(diff%2!=0){
            steps++;
            num+=steps;
            diff = num - target;
        }
        return steps;
    }
}