class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n=s.length();
        int m=t.length();

        if(n!=m){
            return false;
        }
        else{
            int[] count = new int[26];
            for(int i=0;i<n;i++){
                count[s.charAt(i)-'a']++;
            }
            for(int j=0;j<m;j++){
                count[t.charAt(j)-'a']--;
            }
            for(int k=0;k<count.length;k++){
                if(count[k]!=0){
                    return false;
                }
            }
        }
        return true;

    }
}