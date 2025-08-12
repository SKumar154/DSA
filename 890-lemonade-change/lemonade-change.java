class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int n=bills.length;
        int c1=0;
        int c2=0;

        for(int i=0;i<n;i++){
            if(bills[i]==5){
                c1++;
            }else if(bills[i]==10){
                if(c1>0){
                    c1--;
                    c2++;
                }else{
                    return false;
                }
            }else if(bills[i]==20){
                if(c1>0 && c2>0){
                    c1--;
                    c2--;
                }else if(c1>2){
                    c1-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}