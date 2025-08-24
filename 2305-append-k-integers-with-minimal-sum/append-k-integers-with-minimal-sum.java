class Solution {
    public long minimalKSum(int[] nums, int k) {
        

        long sum=(long)k*(k+1)/2;
        int count=0;

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.contains(num) && num<=k && num>=1){
                sum = sum - (long)num;
                count++;
            }
            set.add(num);
        }

        int i=k+1;
        while(count>0){
            if(!set.contains(i)){
                sum+=i;
                count--;
            }
            i++;
        }
        return sum;
        // long sum=0;
        // int n=nums.length;

        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //     set.add(nums[i]);
        // }
        // int i=1;
        // while(k>0){
        //     if(!set.contains(i)){
        //         sum+=i;
        //         k--;
        //     }
        //     i++;
        // }
        // return sum;
    }
}