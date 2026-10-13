class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if((arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z') && 
            (arr[j] >= 'a' && arr[j] <= 'z' || arr[j] >= 'A' && arr[j] <= 'Z')){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(!(arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z')){
                i++;
            }else if(!(arr[j] >= 'a' && arr[j] <= 'z' || arr[j] >= 'A' && arr[j] <= 'Z')){
                j--;
            }
        }
        return new String(arr);
    }
}