class Solution {
    public char findTheDifference(String s, String t) {
        
        if(s.isEmpty()){
            return t.charAt(0);
        }
        char res = '1';
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        int n=a1.length;

        for(int i=0;i<n;i++){
            if(a1[i] != a2[i]){
                res = a2[i];
                break;
            }
        }
        return res=='1' ? a2[a2.length-1] : res; 
    }
}