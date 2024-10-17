class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            HashSet<Integer> temp = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                if (temp.contains(-(nums[i] + nums[j]))) {
                    List<Integer> temp1 = new ArrayList<>();
                    temp1.add(nums[i]);
                    temp1.add(nums[j]);
                    temp1.add(-(nums[i] + nums[j]));
                    Collections.sort(temp1);
                    res.add(temp1);
                }
                temp.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(res);
        return ans;
    }
}