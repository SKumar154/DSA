class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int check = 1;
        while(true){
            if(map.containsKey(check)){
                check++;
            }else{
                break;
            }
        }
        return check;
    }
}