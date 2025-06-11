class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int[] arr = new int [2];
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            int val=target - nums[i];
            if(map.containsKey(val)){
                arr[0] = map.get(val);
                arr[1] = i;
                return arr;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;


    }
}