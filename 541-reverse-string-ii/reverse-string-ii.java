class Solution {

    public void reverseSwap(char[] arr , int i, int j){

        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();
        int n =arr.length;
        for(int i=0;i<n;){
            int j=Math.min(i+k-1,n-1);
            reverseSwap(arr,i,j);
            i=i+2*k;
        }
        return new String(arr);
    }
}