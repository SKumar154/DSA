class Solution {
    public int distributeCandies(int[] candyType) {
        
        Set<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        int n=candyType.length;
        int can=n/2;

        if(set.size()>can || set.size()==can){
            return can;
        }
        return set.size();
    }
}