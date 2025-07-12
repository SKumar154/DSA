class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxFreq = 0; 
        int maxLen = 0;
        int n=s.length();

        for (int j = 0; j < n; j++) {
            char cur = s.charAt(j);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(cur));

            while ((j - i + 1) - maxFreq > k) {
                char lchar = s.charAt(i);
                map.put(lchar, map.get(lchar) - 1);
                i++;
            } 
            maxLen = Math.max(maxLen, j - i + 1);
        } 
        return maxLen;
    }
}