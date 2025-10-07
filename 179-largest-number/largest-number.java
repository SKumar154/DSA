class Solution {
    public String largestNumber(int[] nums) {
        
        int n=nums.length;
        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (x,y) -> (y+x).compareTo(x+y));
        StringBuilder str = new StringBuilder();
        for(String s : arr){
            str.append(s);
        }

        while(str.length()>1 && str.charAt(0) == '0'){
            str.deleteCharAt(0);
        }
        return str.toString();
    }
}