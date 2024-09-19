class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int check = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                check = 1;
                break;
            }
        }
        if (check == 0) {
            return new int[] { -1, -1 };
        }

        for (int i = nums.length - 1; i >= arr[0]; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}