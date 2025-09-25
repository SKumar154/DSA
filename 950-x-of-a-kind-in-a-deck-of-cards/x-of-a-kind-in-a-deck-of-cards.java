class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        int n=deck.length;
        if(n<=1){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int bool = 0;
        for(int key : map.keySet()){
            if(bool == 0){
                bool = map.get(key);
            }else{
                bool = findGCD(bool,map.get(key));
            }
        }
        return bool>=2;
    }
    private int findGCD(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}