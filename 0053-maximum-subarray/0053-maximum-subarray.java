class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maximum = Math.max(sum, maximum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maximum;
    }
}