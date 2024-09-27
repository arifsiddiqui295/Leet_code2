class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int actualSum = (n * (n + 1)) / 2;
        return actualSum - sum;
    }

}