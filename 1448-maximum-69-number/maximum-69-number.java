class Solution {
    public int maximum69Number (int num) {
        
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        String res = new String(arr);
        return Integer.parseInt(res);
    }
}