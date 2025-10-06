class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=changed.length;
        
        if(n%2 != 0){
            return new int[0];
        }
        int[] res = new int[n/2];

        for(int i=0;i<n;i++){
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
        }
        Arrays.sort(changed);
        int idx=0;

        for(int i=0;i<n;i++){
            if(map.get(changed[i]) == 0){
                continue;
            }
            map.put(changed[i],map.get(changed[i])-1);

            if(map.containsKey(changed[i]*2) && map.get(changed[i]*2) > 0){
                res[idx++] = changed[i];

                map.put(changed[i]*2,map.get(changed[i]*2)-1);
            }else{
                return new int[0];
            }
        }
        return res;
    }
}