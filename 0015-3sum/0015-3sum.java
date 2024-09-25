class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ansSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                List<Integer> list = new ArrayList<>();
                int sum = -(nums[i] + nums[j]);
                if (set.contains(sum)) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(sum);
                    Collections.sort(list);
                }
                set.add(nums[j]);
                if (!list.isEmpty()) {
                    ansSet.add(list);
                }
            }
        }
        List<List<Integer>> al = new ArrayList<>();
        al.addAll(ansSet);
        return al;
    }
}