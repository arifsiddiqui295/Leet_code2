class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (var num : nums2) {
            set.add(num);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])) {
                row1.add(nums1[i]);
                set.add(nums1[i]);
            }
        }
        ans.add(new ArrayList<>(row1));
        set.clear();
        row1.clear();

        for (var num : nums1) {
            set.add(num);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!set.contains(nums2[i])) {
                row1.add(nums2[i]);
                set.add(nums2[i]);
            }
        }
        ans.add(new ArrayList<>(row1));
        return ans;
    }
}