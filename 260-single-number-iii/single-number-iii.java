class Solution {
    public int[] singleNumber(int[] nums) {
        
        int[] arr= new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        for(int i : map.keySet()){
            if(map.get(i)==1){
                arr[index++]=i;
                
            }
        }
        return arr;
    }
}