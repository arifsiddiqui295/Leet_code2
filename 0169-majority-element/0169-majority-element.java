class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int count = 0;
        for (var num : nums) {
            if (num == max)
                count++;
            else
                count--;
            if (count < 0) {
                max = num;
                count = 0;
            }
        }
        int freq = 0;
        for (var num : nums) {
            if (num == max)
                freq++;
        }
        if (freq > n / 2)
            return max;

        return -1;
    }
}