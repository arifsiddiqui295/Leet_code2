class Solution {
    public boolean check(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (isSorted(nums)) {
                return true;
            } else {
                int temp = nums[nums.length - 1];
                for (int j = nums.length - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = temp;
            }
            i++;
        }
        return false;
    }

    public boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}