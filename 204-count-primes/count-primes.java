class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;   // handles n=0 and n=1 edge cases immediately

        boolean[] isComposite = new boolean[n];   // false by default = "assumed prime"

        for (int i = 2; (long) i * i < n; i++) {
            if (!isComposite[i]) {
                for (int multiple = i * i; multiple < n; multiple += i) {
                    isComposite[multiple] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        return count;
    }
}