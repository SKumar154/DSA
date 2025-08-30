class Solution {
    public int minFlips(String target) {
        
        int n=target.length();
        int count=0;

        char check = '0';

        for(int i=0;i<n;i++){
            if(target.charAt(i) != check){
                count++;
                check = target.charAt(i);
            }
        }
        return count;
        // int count=0;
        // int n=target.length();
        // String empty = "";
        // for(int i=0;i<n;i++){
        //     empty += "0";
        // }
        // for(int i=0;i<n;i++){
        //     if(target.charAt(i)!=empty.charAt(i)){
        //         empty = flips(empty,i);
        //         count++;
        //     }
        // }
        // return count;
        
    }
    // public String flips(String s, int pos){
    //     int n=s.length();
    //     StringBuilder str = new StringBuilder();
    //     for(int i=0;i<n;i++){
    //         if(i<pos){
    //             str.append(s.charAt(i));
    //         }else{
    //             if(s.charAt(i)=='0'){
    //                 str.append('1');
    //             }else{
    //                 str.append('0');
    //             }
    //         }
    //     }
    //     return str.toString();
    // }
}