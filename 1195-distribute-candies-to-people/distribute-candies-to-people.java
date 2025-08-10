class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int[] res = new int[num_people];
        int j = 0;

        while (candies > 0) {
            for (int i = 0; i < num_people && candies > 0; i++) {
                j++;
                int sub = Math.min(j, candies);
                res[i] += sub;
                candies -= sub;
            }
        }
        return res;
    }
}