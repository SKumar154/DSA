class Solution {
    private void reverseSubString(char[] arr, int i, int j){

        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        
        char[] res = s.toCharArray();
        int n=res.length;
        
        for(int start=0;start<n; start += 2*k){
            int end = Math.min(start+k-1,n-1);
            reverseSubString(res,start,end);
        }
        return new String(res);
    }
}