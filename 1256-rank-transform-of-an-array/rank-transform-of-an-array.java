class Solution {
    public int[] arrayRankTransform(int[] nums) {
        int n=nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int i : sorted){
            if(!map.containsKey(i)){
                map.put(i,rank++);
            }
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}