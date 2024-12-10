class Solution {
    public int removeDuplicates(int[] nums) {
        int key = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev != nums[i]) {
                prev = nums[i];
                int temp = nums[i];
                nums[i] = nums[key];
                nums[key] = temp;
                key++;
            }
        }
        return key;
    }
}