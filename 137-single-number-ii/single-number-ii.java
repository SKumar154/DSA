class Solution {
    public int singleNumber(int[] nums) {
        int value=0;
        int n=nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i)==1){
                return i;
            }
        }
        return 0;
    }
}