class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
                mid = (start + end) / 2;
            }
            if (arr[mid] > target) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
}