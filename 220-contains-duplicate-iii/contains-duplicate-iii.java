// class Solution {
//     public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
//         int n=nums.length;
//         int i=0;
//         int j=1;
//         while(j<n){
//             if(j>=n){
//                 j++;
//                 continue;
//             }
//             if(j-i<=indexDiff){
//                 if(Math.abs(nums[i]-nums[j])<=valueDiff){
//                     return true;
//                 }
//                 j++;
//             }
//             else {
//                 i++;
//                 j=i+1;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            Long num = new Long(nums[i]);
            Long floor = set.floor(num);
            Long ceil = set.ceiling(num);

            if (floor != null && Math.abs(floor - num) <= valueDiff) {
                return true;
            }

            if (ceil != null && Math.abs(ceil - num) <= valueDiff) {
                return true;
            }

            set.add(num);

            if (set.size() > indexDiff) {
                set.remove(1L * nums[i - indexDiff]);
            }
        }

        return false;
    }
}

// TC: O(n * logk), SC: O(k)

// TC: O(n ^ 2), SC: O(1)