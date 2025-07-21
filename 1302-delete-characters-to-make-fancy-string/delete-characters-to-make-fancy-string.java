class Solution {
    public String makeFancyString(String s) {
        
        StringBuilder res = new StringBuilder();
        int n=s.length();
        
        if(n<3){
            return s;
        }

        res.append(s.charAt(0));
        int count=1;

        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                count=1;
            }
            if(count<3){
                res.append(s.charAt(i));
            }
        }
        return res.toString();

    }
}