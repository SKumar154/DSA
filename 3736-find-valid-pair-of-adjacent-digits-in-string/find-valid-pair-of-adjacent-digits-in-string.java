class Solution {
    public String findValidPair(String s) {
        char[] arr = s.toCharArray();
        int n=s.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n-1;i++){
            char first = s.charAt(i);
            char sec = s.charAt(i+1);

            if(first!=sec){
                int fcount=map.get(first);
                int scount=map.get(sec);

                if(fcount == (first - '0')){
                    if(scount == (sec - '0')){
                        return "" + first + sec;
                    }
                }
            }
        }
        return "";
    }    
}