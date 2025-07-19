class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : hand){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        while(map.size()>0){
            int currCard = map.entrySet().iterator().next().getKey();
            for(int j=0;j<groupSize;j++){
                int card = currCard+j;
                if(!map.containsKey(card)){
                    return false;
                }
                map.put(card,map.get(card)-1);
                if(map.get(card)==0){
                    map.remove(card);
                }
            }
        }
        return true;
    }
}