class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int row = -1, column = -1;
        for (int k = 0; k < grid[0].length; k++) {
            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < grid.length; i++) {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] > max) {
                        max = grid[i][j];
                        row = i;
                        column = j;
                    }
                }
                grid[row][column] = -1;
                max2 = Math.max(max2, max);
            }
            sum = sum + max2;
        }
        return sum;
    }
}