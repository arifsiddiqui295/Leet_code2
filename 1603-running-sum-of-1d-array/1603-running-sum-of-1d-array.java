class Solution {
    public int[] runningSum(int[] nums) {
        int prevSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prevSum = nums[i] + prevSum;
            nums[i] = prevSum;
        }
        return nums;
    }
}