class Solution {
    public int findPermutationDifference(String s, String t) {
        
        int n=s.length();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map1.put(c,i);
        }
        for(int i=0;i<n;i++){
            char c = t.charAt(i);
            map2.put(c,i);
        }

        int sum=0;
        int diff=0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            diff = Math.abs(map1.get(c)-map2.get(c));
            sum+=diff;
        }
        return sum;
    }
}