class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // List<Integer> list = new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     if(nums[i]==target){
        //         list.add(i);
        //     }
        // }
        // return list;


        int lowCount=0;
        int targetCount=0;

        for(int i : nums){
            if(i<target){
                lowCount++;
            }
            else if(i==target){
                targetCount++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<targetCount;i++){
            list.add(lowCount++);
        }
        return list;


    }
}