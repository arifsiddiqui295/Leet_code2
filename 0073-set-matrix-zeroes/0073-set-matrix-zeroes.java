class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (var row : rowSet) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }
        for (var col : colSet) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }
    }
}