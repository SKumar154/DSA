class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set =  new LinkedHashSet<>();
        
        for(int i : nums){
            set.add(i);
        }
        int index = 0;
        for(int j : set){
            nums[index++] = j;
        }
        return set.size();

    }
}