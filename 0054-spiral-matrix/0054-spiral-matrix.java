class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                al.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                al.add(matrix[i][right]);
            }
            right--;
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
            }
            left++;
        }
        return al;
    }
}