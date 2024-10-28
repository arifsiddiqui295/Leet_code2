class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 3 == 0) {
                continue;
            } else if (n % 3 == 1) {
                n = n - 1;
                count++;
            } else {
                n = n + 1;
                count++;
            }
        }

        return count;
    }
}