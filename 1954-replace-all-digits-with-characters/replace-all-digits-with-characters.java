class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        int n=s.length();
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder(s);
        for(int i=0;i<n;i++){
            if(i%2==1){
                str.append((char)(s.charAt(i-1)+(s.charAt(i)-'0')));
            }
        }
        int index1=1;
        int index2=0;
        while(index1<n && index2<str.length()){
            result.setCharAt(index1,str.charAt(index2));
            index1+=2;
            index2++;
        }
        return result.toString();
    }
}