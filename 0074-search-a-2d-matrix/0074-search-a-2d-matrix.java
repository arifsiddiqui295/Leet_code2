class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            int mid = (start + end) / 2;
            while (start <= end) {
                if (matrix[i][mid] == target) {
                    return true;
                }
                if (target > matrix[i][mid]) {
                    start = mid + 1;
                    mid = (start + end) / 2;
                }
                if (target < matrix[i][mid]) {
                    end = mid - 1;
                    mid = (start + end) / 2;
                }
            }

        }
        return false;
    }
}