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
}
