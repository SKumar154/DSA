class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> result= new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }
        for(int j : nums2){
            if(set.contains(j)){
                result.add(j);
            }
        }
        int[] arr = new int[result.size()];
        int index=0;
        for(int num : result){
            arr[index++]= num;
        }
        return arr;
    }
}