class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int it = 0;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (nums1[i] == 0) {
                it++;
            } else {
                break;
            }
        }
        int ans = nums1.length - it;
        for (int i = 0; i < nums2.length; i++) {
            nums1[ans] = nums2[i];
            ans++;
        }
        Arrays.sort(nums1);
    }
}