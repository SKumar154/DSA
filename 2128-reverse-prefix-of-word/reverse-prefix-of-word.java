class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch) == -1){
            return word;
        }
        char[] arr = word.toCharArray();
        int ch_index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ch){
                ch_index = i;
                break;
            }
        }
        int left = 0;
        int right = ch_index;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}