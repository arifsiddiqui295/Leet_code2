class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int square = n * n;
        int count = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // top
            for (int i = left; i <= right; i++) {
                ans[top][i] = count;
                count++;
            }
            top++;

            // right
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = count;
                count++;
            }
            right--;

            // bottom
            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = count;
                    count++;
                }
            }
            bottom--;

            // left
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = count++;
                }
            }
            left++;
        }
        return ans;
    }
}