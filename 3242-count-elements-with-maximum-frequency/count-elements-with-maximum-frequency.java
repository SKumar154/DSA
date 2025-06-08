class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer,Integer> freq = new HashMap<>();

        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int max=0;
        for(int j : freq.values()){
            if(j>max){
                max = j;
            }
        }

        int count =0;
        for(int k : freq.values()){
            if(k==max){
                count += k;
            }
        }
        return count;
    }
}