class Solution {
    public int beautySum(String s) {
        //HashMap<Character,Integer> map = new HashMap<>();

        int n=s.length();
        // int total=(n*(n+1))/2;
        // int count=0;
        // int max=0;
        // int min=0;
        
        // for(char i : s.toCharArray()){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(char beauty : map.keySet()){
        //     max=Math.max(max,map.get(beauty));
        //     min=Math.min(min,map.get(beauty));
        // }
        // if((max-min)>=1){
        //     count++;
        // }
        // return (total-count);

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
                cnt += beauty(map);  
            }
        }

        return cnt;
        
    }

    public int beauty(HashMap<Character,Integer> map){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(char i:map.keySet()){
            max=Math.max(max,map.get(i));
            min=Math.min(min,map.get(i));
        }

        return max-min;
    }
}