class Solution {
    public int maxBottlesDrunk(int bot, int x) {
        
        int res = 0;
        int empty = 0;

        res += bot;
        empty += bot;
        while(empty>=x){
            empty = empty - x;
            res++;
            x++;
            empty++;
        }
        return res;
    }
}