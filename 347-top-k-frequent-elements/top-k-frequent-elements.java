class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int[] res = new int[k];
        int index=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        while(k>0){
            for(int key : map.keySet()){
                max = Math.max(max,map.get(key));
            }
        
            for(int val : map.keySet()){
                if(map.get(val) == max){
                    res[index++] = val;
                    map.put(val, -1);
                    k--;
                }
            }
            max=Integer.MIN_VALUE;
            
        }
        return res;
    }
}