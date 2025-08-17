class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(nos(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean nos(int n){

        if(n<=9 && n!=0){
            return true;
        }
        int temp = n;

        while(temp>0){
            int digit = temp%10;
            if(digit == 0 || n%digit!=0){
                return false;
            }
            temp/=10;
        }
        return true;
    }
}