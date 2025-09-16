class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        int n=text.length();
        StringBuilder str = new StringBuilder();
        int count=0;
        for(char ch : text.toCharArray()){
            if(ch != ' '){
                str.append(ch);
            }else{
                if(check(str.toString(),brokenLetters)){
                    count++;
                }
                str.setLength(0);
            }
        }
        if(str.length()>0 && check(str.toString(),brokenLetters)){
            count++;
        }
        return count;

    }
    public boolean check(String s, String no){
        int n=s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : no.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                return false;
            }
        }
        return true;
    }
}