class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],nums[i]);
        }
        int firstMiss = 1;
        while(true){
            if(map.containsKey(firstMiss)){
                firstMiss++;
            }else{
                break;
            }
        }
        return firstMiss;
    }

}