class Solution {
    public int trap(int[] height) {
        if (isSorted(height))
            return 0;
        int ans = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int lmax = height[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, height[j]);
            }
            int rmax = height[i];
            for (int j = i + 1; j < height.length; j++) {
                rmax = Math.max(rmax, height[j]);
            }
            ans = ans + Math.min(lmax, rmax) - height[i];

        }
        return ans;
    }

    static boolean isSorted(int[] arr) {
        // for incresing
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        // for decreasing
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;

    }
}