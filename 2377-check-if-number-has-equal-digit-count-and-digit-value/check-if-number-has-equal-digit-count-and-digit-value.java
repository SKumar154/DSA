class Solution {
    public boolean digitCount(String num) {

        int n=num.length();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int ch = num.charAt(i)-'0';
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<n;i++){
            if(num.charAt(i)-'0' != map.getOrDefault(i,0)){
                return false;
            }
        }
        return true;
    }
}