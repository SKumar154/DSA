class Solution {
    public int[] frequencySort(int[] nums) {
        
        int n=nums.length;
        int index=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer[] copy = new Integer[n];
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            copy[index++] = i;
        }

        Arrays.sort(copy, (a,b) ->{
            if(map.get(a)!=map.get(b)){
                return map.get(a)-map.get(b);
            }else {
                return b-a;
            }
        });

        for(int j=0;j<n;j++){
            nums[j] = copy[j];
        }
        return nums;
    }
}