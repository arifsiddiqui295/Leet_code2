class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverse(0, n - k - 1, nums);
        reverse(n - k, nums.length - 1, nums);
        reverse(0, nums.length - 1, nums);
    }

    public static void reverse(int start, int end, int[] arr) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}