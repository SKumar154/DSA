class Solution {
    public String digitSum(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        
        while(str.length() > k){
            StringBuilder newStr = new StringBuilder();
            int i = 0;
            
            while(i < str.length()){
                int sum = 0;
                int count = 0;
                
                while(count < k && i < str.length()){
                    sum += (str.charAt(i) - '0');
                    count++;
                    i++;
                }
                
                newStr.append(String.valueOf(sum));
            }
            
            str = newStr;
        }
        
        return str.toString();
    }
}