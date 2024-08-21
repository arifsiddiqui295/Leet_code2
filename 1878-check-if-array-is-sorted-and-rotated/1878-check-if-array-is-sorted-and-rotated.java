class Solution {
    public boolean check(int[] nums) {
        int j = nums.length - 1;
        boolean check = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                check = false;
            }
        }
        if(check ==true) return true;
        while (j > 0) {
            boolean isSorted = true;
            int x = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = x;
            j--;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    isSorted = false;
                }
            }
            if (isSorted == true)
                return true;
        }
        return false;
    }
}