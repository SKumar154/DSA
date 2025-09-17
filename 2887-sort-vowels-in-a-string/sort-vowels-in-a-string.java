class Solution {
    public String sortVowels(String s) {
        
        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        ); // To directly add elements in a HashSet

        ArrayList<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(vowels.contains(ch)){
                list.add(ch);
            }
        }
        Collections.sort(list);
        StringBuilder str = new StringBuilder();
        int index=0;
        for(char ch : s.toCharArray()){
            if(vowels.contains(ch)){
                str.append(list.get(index++));
            }else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}