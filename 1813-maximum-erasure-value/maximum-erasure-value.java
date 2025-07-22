class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int i=0;
        int j=0;
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            if(!map.containsKey(nums[j])){
                map.put(nums[j],1);
                sum+=nums[j];
                max=Math.max(max,sum);
                j++;
            } else if(map.containsKey(nums[j])){
                map.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
        }
        return max;
    }
}