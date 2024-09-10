class Solution {
    public void rotate(int[][] arr) {
        int r1= arr.length;
        int c1= arr.length;
        int brr[][] = new int[r1][c1];
        int l = 0;
        for(int i = 0;i<r1;i++){
            int k = r1-1;
            for(int j = 0;j<r1;j++){
                brr[i][j]=arr[k][l];
                k--;
            }
            l++;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
              arr[i][j]=brr[i][j];
            }
        }
    }
}