class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2)
            return;
        int zeroP = -1;
        int first = -2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && first == -2) {
                zeroP = i;
                first = 1;
            } else if (nums[i] != 0&&first==1) {
                int temp = nums[i];
                nums[i] = nums[zeroP];
                nums[zeroP] = temp;
                zeroP++;
            }
        }
    }
}