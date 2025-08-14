class Solution {
    public String largestGoodInteger(String num) {
        
        int n=num.length();
        int count=0;
        String res = "";
        for(int i=0;i<n-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                String good = num.substring(i,i+3);

                if(res.isEmpty() || good.compareTo(res)>0){
                    res = good;
                }
            }
        }
        return res;
    }
}