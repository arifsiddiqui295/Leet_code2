class Solution {
    public List<List<Integer>> generate(int n) {
        // List<List<Integer>> ans = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        // List<Integer> row = new ArrayList<>();
        // row.add(1);

        // for (int j = 1; j < i; j++) {
        // row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
        // }
        // if (i > 0) {
        // row.add(1);
        // }
        // ans.add(row);
        // }
        // return ans;

        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }

        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < ans[i].length; j++) {
                row.add(ans[i][j]);
            }
            al.add(row);
        }
        return al;
    }
}