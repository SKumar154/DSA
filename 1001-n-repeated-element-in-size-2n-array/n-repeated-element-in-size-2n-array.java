class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int ans=0;
        for(int key : map.keySet()){
            max=Math.max(max,map.get(key));
        }
        for(int key : map.keySet()){
            if(map.get(key)==max){
                ans=key;
            }
        }
        return ans;
    }
}