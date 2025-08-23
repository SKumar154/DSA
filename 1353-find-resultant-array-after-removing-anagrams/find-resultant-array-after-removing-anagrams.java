class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        ArrayList<String> res = new ArrayList<>();
        
        int n=words.length;
        String check = words[0];
        res.add(check);
        for(int i=1;i<n;i++){
            if(!isAnagram(check,words[i])){
                check = words[i];
                res.add(words[i]);
            }else{
                continue;
            }
        }
        return res;
    }
    public boolean isAnagram(String a, String b){

        if(a.length() != b.length()){
            return false;
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}