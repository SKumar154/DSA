class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        int index=0;
        for(int i : nums){
            if(set.contains(i)){
                res[index++] = i;
            }else{
                set.add(i);
            }
        }
        return res;
    }
}