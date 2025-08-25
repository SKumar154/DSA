class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n=nums.length;
        // int pro=1;
        // int index=0;
        // int[] res= new int[n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             pro*=nums[j];
        //         }
        //     }
        //     res[index++] = pro;
        //     pro=1;
        // }
        // return res;

        int n=nums.length;
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            res[i] = 1;
        }

        int left = 1;
        for(int i=0;i<n;i++){
            res[i] *= left;
            left *= nums[i];
        }

        int right=1;
        for(int i=n-1;i>=0;i--){
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}