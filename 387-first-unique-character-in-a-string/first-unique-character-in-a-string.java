class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        int res=-1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(map.get(c)==1){
                res = i;
                break;
            }else{
                continue;
            }
        }
        return res;
    }
}