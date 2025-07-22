class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : digits){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j=100;j<=998;j=j+2){
            int count=0;
            int temp=j;
            HashMap<Integer, Integer> wMap = new HashMap<>(map);
            while(temp>0){
                int digit=temp%10;
                if(!wMap.containsKey(digit) ){
                    break;
                }else if(wMap.containsKey(digit)){
                    count++;
                    wMap.put(digit,wMap.get(digit)-1);
                    if(wMap.get(digit)==0){
                        wMap.remove(digit);
                    }
                }
                temp/=10;
            }
            if(count==3){
                list.add(j);
            }
        }
        int[] res = new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
        return res;
    }
}