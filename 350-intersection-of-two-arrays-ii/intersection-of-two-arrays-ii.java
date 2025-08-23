class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;
        int[] res = new int[n+m];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<m;i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums1[i])){
                res[index++] = nums1[i];
                if(map.get(nums1[i])>1){
                    map.put(nums1[i],map.get(nums1[i])-1);
                }else{
                    map.remove(nums1[i]);
                }
            }
        }
        return Arrays.copyOfRange(res,0,index);
    }
}