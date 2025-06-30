class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];

        int pid=0; 
        int nid=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[pid] = nums[i];
                pid+=2;
            }
            else{
                arr[nid] = nums[i];
                nid+=2;
            }
        }
        return arr;
    }
}