class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int n = nums.length;
        int sumAll = (n * (n + 1)) / 2;
        int ans = sumAll - sum;
        return ans;
    }
}