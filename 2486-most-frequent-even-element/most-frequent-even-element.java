class Solution {
    public int mostFrequentEven(int[] nums) {
        
        int freq=0;
        int element = -1;
        int n=nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);

            if(i%2==0){
                int count = map.get(i);

                if(count > freq || (count == freq && i < element)){
                    freq = count;
                    element = i;
                }
            }
        }
        return element;
    }
}