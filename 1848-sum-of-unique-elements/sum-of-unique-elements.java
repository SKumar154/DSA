class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
}