class Solution {
    public int countHillValley(int[] nums) {
        
        int n=nums.length;
        int count=0;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        int n1=list.size();
        for(int i=1;i<n1-1;i++){
            if(list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1)){
                count++;
            }else if(list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1)){
                count++;
            }
        }
        return count;
    }
}