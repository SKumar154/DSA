class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k%n;
        int index=0;
        if(k==0){
            return;
        }
        int[] arr = new int[n];
        for(int i=n-k; i<n; i++){
           arr[index]=nums[i];
           index++;
        }
        for(int j=0; j<n-k; j++){
            arr[index]=nums[j];
            index++;
        }
        for(int i=0; i<n; i++){
            nums[i]=arr[i];
        }

    }
}