class Solution {
    public int[] separateDigits(int[] nums) {
        
        List<Integer> arr=new ArrayList<>();
        for(int num : nums){
            List<Integer> temp =new ArrayList<>();
            while(num>0){
                temp.add(num%10);
                num/=10;
            }
            int n=temp.size();
            for(int j=n-1;j>=0;j--){
                arr.add(temp.get(j));
            }
        }

        int[] res = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}