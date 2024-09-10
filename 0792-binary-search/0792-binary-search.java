class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while (start <=end) {
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                start = mid + 1;
                mid = (start + end) / 2;
            }
            if (target < nums[mid]) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
}