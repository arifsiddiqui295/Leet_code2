class Solution {
    public int removeDuplicates(int[] nums) {
        int dup = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                int temp = nums[i];
                nums[i] = nums[dup];
                nums[dup] = temp;
                dup++;
            }
        }
        return dup;
    }
}