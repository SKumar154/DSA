class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int n=nums.length;
        int ans=0;
        for(int i : nums){
            if(set.contains(i)){
                ans=i;
            }else{
                set.add(i);
            }
        }
        return ans;
    }
}