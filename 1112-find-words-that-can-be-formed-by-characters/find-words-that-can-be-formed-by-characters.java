class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int n=words.length;
        int count=0;
        for(String i : words){
            if(check(i,chars)){
                count += i.length();
            }
        }
        return count;
    }
    public boolean check(String s,String chars){

        HashMap<Character,Integer> map = new HashMap<>();
        int n1=chars.length();
        for(int i=0;i<n1;i++){
            char ch = chars.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int n2=s.length();
        for(int i=0;i<n2;i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}