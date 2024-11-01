class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int row = i;
                int col = j;
                int rowMin = Integer.MAX_VALUE;
                int colMax = Integer.MIN_VALUE;
                for (int k = 0; k < matrix[0].length; k++) {
                    rowMin = Math.min(rowMin, matrix[row][k]);
                }
                for (int k = 0; k < matrix.length; k++) {
                    colMax = Math.max(colMax, matrix[k][col]);
                }

                if (matrix[i][j] == rowMin && matrix[i][j] == colMax) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}