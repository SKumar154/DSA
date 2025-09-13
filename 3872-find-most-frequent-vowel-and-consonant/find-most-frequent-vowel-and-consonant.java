class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int cmax=0;
        int vmax=0;
        for(char key : map.keySet()){
            if(key=='a' || key=='e' || key=='i' || key=='o' || key=='u'){
                vmax = Math.max(vmax,map.get(key));
            }else{
                cmax = Math.max(cmax,map.get(key));
            }
        }
        return vmax+cmax;
    }
}