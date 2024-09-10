class Solution {
    public void rotate(int[][] arr) {
        int r1 = arr.length;
        int c1 = arr.length;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            int start = 0;
            int end = r1-1;
            for (int j = r1 - 1; j >= r1 / 2; j--) {
                int temp = arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                end--;
                start++;
            }
        }
    }
}