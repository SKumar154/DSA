class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        while(j<n){
            int element = fruits[j];
            map.put(element,map.getOrDefault(element,0)+1);

            if(map.size()<2){
                j++;
            }
            else if(map.size()==2){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>2){
                while(map.size()>2 && i<=j){
                    int r = fruits[i];
                    map.put(r,map.get(r)-1);
                    if(map.get(r)==0){
                       map.remove(r); 
                    }
                    i++;
                }   
                j++;
            }
        }
        return max == Integer.MIN_VALUE ? n : max;
    }
}