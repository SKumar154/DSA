class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<n+1;i++){
            if(!map.containsKey(i)){
                res.add(i);
            }else{
                continue;
            }
        }
        return res;
    }
}