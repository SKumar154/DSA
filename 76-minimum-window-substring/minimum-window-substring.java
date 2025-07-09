class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";
        char[] arr = s.toCharArray();

        HashMap<Character, Integer> kmap = new HashMap<>();
        for (char h : t.toCharArray()) {
            kmap.put(h, kmap.getOrDefault(h, 0) + 1);
        }

        int count = kmap.size();
        HashMap<Character, Integer> map = new HashMap<>(kmap);

        while (j < m) {
            if (!map.containsKey(arr[j])) {
                j++;
            } else if (map.containsKey(arr[j])) {
                char r = arr[j];
                map.put(r, map.get(r) - 1);
                if (map.get(r) == 0) {
                    count--;
                }

                while (count == 0) {
                    if (min>j-i+1) {
                        ans=s.substring(i,j+1);
                        min=j-i+1;
                    }
                    if (!map.containsKey(arr[i])) {
                        i++;
                    } else {
                        char l = arr[i];
                        map.put(l,map.get(l)+1);
                        if (map.get(l)>0) {
                            count++;
                        }
                        i++;
                    }
                }
                j++;
            }
        }
        return ans;
    }
}