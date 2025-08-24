class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n=nums.length;
        int[] res = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        int index=0;
        int n1=operations.length;
        int n2=operations[0].length;

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<n1;i++){
            
            int oldVal = operations[i][0];
            int newVal = operations[i][1];

            int pos = map.get(oldVal);
            nums[pos] = newVal;

            map.remove(oldVal);
            map.put(newVal,pos);
        }
        return nums;
    }
}