class Solution {
    public char repeatedCharacter(String s) {
        
        int n=s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        char res ='1';
        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            map.put(c,map.getOrDefault(c,0)+1);

            if(map.get(c)==2){
                res = c;
                break;
            }
        }
        return res;
    }
}