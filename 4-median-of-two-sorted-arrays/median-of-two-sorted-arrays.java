class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1=nums1.length;
        int n2=nums2.length;
        int[] res = new int[n1+n2];
        int index=0;
        for(int i=0;i<n1;i++){
            res[index++] = nums1[i];
        }
        for(int i=0;i<n2;i++){
            res[index++] = nums2[i];
        }
        int n=res.length;
        if(n==0){
            return 0.00000;
        }
        if(n==1){
            return res[0]/1.00000;
        }
        Arrays.sort(res);
        int mid=n/2;
        double val=0.0;
        if(n%2==0){
            val = (res[mid-1] + res[mid])/2.00000;
        }else{
            val = (res[mid])/1.00000;
        }
        return val;
    }
}