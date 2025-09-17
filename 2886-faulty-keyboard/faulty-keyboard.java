class Solution {
    public String finalString(String s) {
        

        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != 'i'){
                res.append(ch);
            }else{
                res.reverse();
            }
        }
        return res.toString();
        // StringBuilder rev = new StringBuilder();
        // for(char ch : s.toCharArray()){
        //     if(ch != 'i'){
        //         rev.append(ch);
        //     }else{
        //         rev = new StringBuilder(reverse(rev.toString()));
        //     }
        // }
        // return rev.toString();
    }
    // public String reverse(String s){
    //     int n=s.length();
    //     StringBuilder str = new StringBuilder();
    //     for(int i=n-1;i>=0;i--){
    //         str.append(s.charAt(i));
    //     }
    //     return str.toString();
    // }
}