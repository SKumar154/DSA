class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        res.add("");

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            String letters = mapping[digit];
            List<String> nextRes = new ArrayList<>();

            for (String prevStr : res) {
                for (int j = 0; j < letters.length(); j++) {
                    nextRes.add(prevStr + letters.charAt(j));
                }
            }
            res = nextRes;
        }
        return res;
    }
}