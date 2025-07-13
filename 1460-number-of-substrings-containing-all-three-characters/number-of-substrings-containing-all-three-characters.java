class Solution {
    public int numberOfSubstrings(String s) {

        int n=s.length();
        int[] arr = new int[3];
        int i=0;
        int count=0;
        int currCount=0;

        for(int j=0;j<n;j++){
            char ch1= s.charAt(j);
            arr[ch1 - 'a']++;
            if(arr[ch1 - 'a']==1){
                currCount++;
            }
            while(currCount==3){
                count += n-j;
                char ch2= s.charAt(i);
                arr[ch2 - 'a']--;
                if(arr[ch2 - 'a']==0){
                    currCount--;
                }
                i++;
            }
        }
        return count;
    }
}

        // int n=s.length();
        // char[] arr = s.toCharArray();
        // int count=0;
        // String str="abc";
        // int m=str.length();
        // int i=0;
        // int j=0;
        // char[] given = str.toCharArray();
        // HashMap<Character,Integer> map = new HashMap<>();
        // HashMap<Character,Integer> compare = new HashMap<>();

        // for(int e=0;e<m;e++){
        //     char c = given[e];
        //     compare.put(c,compare.getOrDefault(c,0)+1);
        // }

        // while(j<n){
        //     char ch=arr[j];
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        //     j++;

        //     if(map.size()>=compare.size()){
        //         Set<Character> mapKeys = map.keySet();
        //         Set<Character> compareKeys = compare.keySet();

        //         if(mapKeys.containsAll(compareKeys)){
        //             count+=n-j+1;
        //         }
        //         char r=arr[i];
        //         map.put(r,map.get(r)-1);

        //         if(map.get(r)==0){
        //             map.remove(r);
        //         }
        //         i++;
        //     }
        // }
        // return count;