class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int maxLength=Integer.MIN_VALUE;
        char[] arr = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            char c=arr[j];
            map.put(c,map.getOrDefault(c,0)+1);

            if(map.get(c)==1){
                maxLength=Math.max(maxLength,j-i+1);
                j++;
            }
            else if(map.get(c)>1){
                while(map.get(c)>1 && i<=j){
                    char r=arr[i];
                    map.put(r,map.get(r)-1);
                    if(map.get(r)==0){
                        map.remove(r);
                    }
                    i++;
                }
                j++;
            }
        }
        return maxLength == Integer.MIN_VALUE? 0 : maxLength;
    }
}