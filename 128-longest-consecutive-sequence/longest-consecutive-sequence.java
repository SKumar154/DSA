class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        TreeSet<Integer> set =  new TreeSet<>();

        for(int i : nums){
            set.add(i);
        }
        int result=1;
        int max=1;
        int first = set.pollFirst();
        while(!set.isEmpty()){
            int sec=set.pollFirst();
            if(sec-first==1){
                result++;
                max=Math.max(max,result);
            }else{
                result=1;
            }
            first=sec;
        }
        return max;

    }
}