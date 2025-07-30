class Solution {
    public int[] numberGame(int[] nums) {

        int n = nums.length;
        int minA = 1000;
        int minB = 1000;
        int[] res = new int[n];
        int index = 0;
        int length = n;

        while (length > 0) {
            minA=1000;
            for (int i = 0; i < n; i++) {
                minA = Math.min(minA, nums[i]);
            }
            for (int k = 0; k < n; k++) {
                if (nums[k] == minA) {
                    nums[k] = 1000;
                    break;
                }
            }
            minB=1000;
            for (int j = 0; j < n; j++) {
                minB = Math.min(minB, nums[j]);
            }
            for (int l = 0; l < n; l++) {
                if (nums[l] == minB) {
                    nums[l] = 1000;
                    break;
                }
            }
            res[index++] = minB;
            res[index++] = minA;
            length-=2;
        }
        return res;
    }
}