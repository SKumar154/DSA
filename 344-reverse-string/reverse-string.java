class Solution {
    public void reverseString(char[] s) {
        
        // int n = s.length;
        // char[] dummy = new char[n];
        // for(int i=n-1;i>=0;i--){
        //     dummy[n-1-i]= s[i];
        // }
        // int index=0;
        // for(int i=0;i<n;i++){
        //     s[index++] = dummy[i];
        // }

        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}