class Solution {

    public void reverseSwap(char[] arr, int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j<n && arr[j]!=' '){
                j++;
            }
            reverseSwap(arr,i,j-1);
            i=j;
        }
        return new String(arr);
    }
}