class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,List<int[]>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                int sum = i+j;
                int[] pair ={i,j};
//If we normally put map.put(sum,pair)... It would override the previous value as one key can only have one value
//"putIfAbsent" does not override it checks if the key is present 
// If yes, adds a pair to it... If no create a ArrayList and then add the value
                map.putIfAbsent(sum,new ArrayList<>());
                map.get(sum).add(pair);
            }
        }
        //Result array
        int[] res = new int[m*n];
        int index=0;

        //Traversing through the keys
        for(int sum=0;sum<n+m-1;sum++){
            List<int[]> cords = map.get(sum);

            if(sum%2==0){
                for(int k=cords.size()-1;k>=0;k--){
                    int[] key = cords.get(k);
                    res[index++] = mat[key[0]][key[1]];
                }
                
            }else{
                for(int[] key : cords){
                    res[index++] = mat[key[0]][key[1]];
                }
            }
        }
        return res;
    }
}