class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        boolean duplicate = false;
        for(int i : map.keySet()){
            if(map.get(i)>=2){
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }
}