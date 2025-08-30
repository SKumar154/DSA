class Solution {
    public int longestPalindrome(String s) {
        
        int n=s.length();
        if(n==1){
            return 1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=0;
        boolean check=false;
        for(char key : map.keySet()){
            if(map.get(key)%2==0){
                count+=map.get(key);
            }else{
                count+=map.get(key)-1;
                check = true;
            }
        }
        if(check){
            return ++count;
        }
        return count;
    }
}