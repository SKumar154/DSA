class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        if(map.size()==0) return -1;

        for(int key : map.keySet()){
            max = Math.max(map.get(key),max);
        }
        for(int key : map.keySet()){
            if(map.get(key)==max){
                min=Math.min(key,min);
            }
        }
        return min;

    }
}