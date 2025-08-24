class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        int n1=banned.length;
        Set<Integer> set = new HashSet<>();
        int sum=0;
        int count=0;
        for(int i=0;i<n1;i++){
            set.add(banned[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                if(sum+i<=maxSum){
                    sum+=i;
                    count++;
                }else{
                    continue;
                }
            }else{
                continue;
            }
        }
        return count;
    }
}