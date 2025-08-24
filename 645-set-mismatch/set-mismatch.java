class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];

        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                res[0] = i;
            }
            set.add(i);
        }
        int i=1;
        while(true){
            if(!set.contains(i)){
                res[1] = i;
                break;
            }else{
                i++;
            }
        }
        return res;
    }
}