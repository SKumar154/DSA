class Solution {
    public int countVowelSubstrings(String word) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                map.clear();
                for(int j = i; j < word.length(); j++){
                    char curr = word.charAt(j);
                    if(curr =='a' || curr =='e' || curr =='i' || curr =='o' || curr =='u'){
                        map.put(curr, 1);
                        if(map.size() == 5){
                            count++;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        return count;
    }
}