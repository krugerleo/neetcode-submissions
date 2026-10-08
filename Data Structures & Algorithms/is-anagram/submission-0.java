class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] contador = new int[26];
        for(int i = 0; i < s.length(); i++){
            contador[((int) s.charAt(i)) - 97] += 1;
            contador[((int) t.charAt(i)) - 97] -= 1;
        }
        for (int count : contador) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}
