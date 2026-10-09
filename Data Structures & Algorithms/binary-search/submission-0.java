class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int newPoint;
        while(left <= right){
            newPoint = left + (right - left) / 2;
            
            if (nums[newPoint] == target) {
                return newPoint;
            } else if (nums[newPoint] < target) {
                left = newPoint + 1; // Narrow search to right half
            } else {
                right = newPoint - 1; // Narrow search to left half
            }
        }
        return -1;
    }
}
