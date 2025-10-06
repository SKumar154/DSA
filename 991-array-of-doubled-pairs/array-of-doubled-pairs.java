class Solution {
    public boolean canReorderDoubled(int[] arr) {
        
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        if(n%2 != 0){
            return false;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        boolean check = true;
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==0){
                continue;
            }
            map.put(arr[i],map.get(arr[i])-1);
            
            int target = (arr[i]<0 && arr[i]%2==0) ? arr[i]/2 : arr[i]*2;

            if(map.containsKey(target) && map.get(target)>0){
                check = true;
                map.put(target,map.get(target)-1);
            }else{
                check = false;
                break;
            }
        }
        return check;
    }
}