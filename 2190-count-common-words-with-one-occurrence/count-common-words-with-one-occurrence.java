class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        int n1=words1.length;
        int n2=words2.length;

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(int i=0;i<n1;i++){
            String str = words1[i];
            map1.put(str,map1.getOrDefault(str,0)+1);
        }
        for(int i=0;i<n2;i++){
            String str = words2[i];
            map2.put(str,map2.getOrDefault(str,0)+1);
        }
        int count=0;
        for(String key : map1.keySet()){
            if(map2.containsKey(key) && (map2.get(key) == map1.get(key)) && map1.get(key)==1){
                count++;
            }
        }
        return count;
    }
}