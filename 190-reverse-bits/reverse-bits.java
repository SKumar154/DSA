class Solution {
    private String reverseBinary(String str){
        char[] arr = str.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);

        str = "0".repeat(32 - str.length()) + str;

        return Integer.parseInt(reverseBinary(str),2);
    }
}