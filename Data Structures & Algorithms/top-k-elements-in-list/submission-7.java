class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1)
            return nums;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueElements = new ArrayList<>(freq.keySet());

        uniqueElements.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;

    }
}
