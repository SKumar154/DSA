class Solution {
    public int differenceOfSum(int[] nums) {
        // int totalSum=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     totalSum+=nums[i];
        // }
        // List<Integer> list = new ArrayList<>();
        // for(int num : nums){
        //     List<Integer> temp = new ArrayList<>();
        //     while(num>0){
        //         temp.add(num%10);
        //         num/=10;
        //     }
        //     for(int j=temp.size()-1;j>=0;j--){
        //         list.add(temp.get(j));
        //     }
        // }
        // int digitSum=0;
        // int[] arr = new int[list.size()];
        // for(int k=0;k<list.size();k++){
        //     digitSum+=list.get(k);
        // }
        // int absDiff=0;
        // absDiff=Math.abs(totalSum-digitSum);

        // return absDiff;

        int eSum=0;
        int dSum=0;
        int abs=0;

        for(int num : nums){
            eSum+=num;
            int n=num;
            while(n>0){
                dSum+=n%10;
                n/=10;
            }
        }
        abs=Math.abs(eSum-dSum);
        return abs;
    }
}