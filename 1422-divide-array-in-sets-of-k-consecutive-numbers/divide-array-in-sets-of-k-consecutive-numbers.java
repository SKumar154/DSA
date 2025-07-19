class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        
        int n=nums.length;
        if(n%k!=0){
            return false;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        while(map.size()>0){
            int curr = map.entrySet().iterator().next().getKey();
            for(int j=0;j<k;j++){
                int num = curr + j;
                if(!map.containsKey(num)){
                    return false;
                }
                map.put(num,map.get(num)-1);
                if(map.get(num)==0){
                    map.remove(num);
                }
            }
        }
        return true;
        

    }
}