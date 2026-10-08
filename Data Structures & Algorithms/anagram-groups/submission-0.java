class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();        
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String chave = new String(charArray);
            if(!map.containsKey(chave)){
                map.put(chave, new ArrayList<>());
            }
            map.get(chave).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public Boolean anagram(String s, String t){
        if(s.length() != t.length())
            return false;
        int[] contador = new int[26];

        for(int i = 0; i< s.length() ;i++){
            contador[s.charAt(i) - 'a'] +=1;
            contador[t.charAt(i) - 'a'] -=1;
        }

        for(int count : contador){
            if(count != 0)
                return false;
        }
        return true;
    }
}
