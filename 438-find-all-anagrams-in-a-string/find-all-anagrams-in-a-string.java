class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        char[] arr=s.toCharArray();
        int i=0;
        int j=0;
        int n=s.length();
        int k=p.length();
        int index=0;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Character,Integer> kmap = new HashMap<>();
        for(char element : p.toCharArray()){
            kmap.put(element,kmap.getOrDefault(element,0)+1);
        }
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            char h = arr[j];
            map.put(h,map.getOrDefault(h,0)+1);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(map.equals(kmap)){
                    res.add(i); 
                }
                char r = arr[i];
                map.put(r,map.get(r)-1);
                if(map.get(r)==0){
                    map.remove(r);
                }
                i++;
                j++;
            }
        }
        return res;
    }
}