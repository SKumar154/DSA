class Solution {
    public boolean checkValidString(String s) {

        int min=0;
        int max=0;

        for(char c : s.toCharArray()){
            if(c=='('){
                min++;
                max++;
            }else if(c==')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(max<0){
                return false;
            }
            if(min<0){
                min=0;
            }
        }
        return min==0;

        // int count=0;
        // int error=0;
        // int n=s.length();
        
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)=='('){
        //         count++;
        //     }else if(s.charAt(i)==')'){
        //         count--;
        //     }else{
        //         error++;
        //     }
        // }
        // if(count!=0){
        //     count = Math.abs(count) - error;
        // }
        // return count==0 ? true : false;
    }
}