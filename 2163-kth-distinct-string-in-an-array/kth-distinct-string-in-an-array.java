class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        int n=arr.length;
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String curr = arr[i];
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        List<String> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = arr[i];
            if(map.get(str) == 1){
                res.add(str);
            }
        }
        for(int i=0;i<res.size();i++){
            if(i==k-1){
                return res.get(i);
            }
        }
        return "";
    }
}