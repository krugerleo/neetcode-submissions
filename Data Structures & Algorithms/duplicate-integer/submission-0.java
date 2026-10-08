class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> visto = new HashSet<>();

        for(int num : nums){
            if (visto.contains(num)) return true;
            visto.add(num);
        }
        return false;
    }
}