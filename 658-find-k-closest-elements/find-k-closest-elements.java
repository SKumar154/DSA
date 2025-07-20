class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        int n=nums.length;
        int left=0;
        int right=n-1;

        while(right-left>=k){
            if(Math.abs(nums[left]-x) > Math.abs(nums[right]-x)){
                left++;
            }else{
                right--;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            res.add(nums[i]);
        }
        return res;

    }
}