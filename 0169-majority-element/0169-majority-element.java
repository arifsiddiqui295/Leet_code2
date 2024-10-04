class Solution {
    public int majorityElement(int[] nums) {
        int max = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                max = nums[i];
                count = 0;
            }
        }
        int freq = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max == nums[i]) {
                freq++;
            }
        }
        if (freq > nums.length / 2) {
            return max;
        }
        return -1;
    }
}