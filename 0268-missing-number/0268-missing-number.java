class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int subsum = 0;
        for (int i = 0; i < nums.length; i++) {
            subsum = subsum + nums[i];
        }
        int difference = sum - subsum;
        return difference;
    }
}