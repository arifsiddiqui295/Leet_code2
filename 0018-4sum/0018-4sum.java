class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> temp = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long sum = nums[i] + nums[j];
                    sum = sum + nums[k];
                    long fourth = target - (sum);
                    if (temp.contains(fourth)) {
                        List<Integer> temp1 = new ArrayList<>();
                        temp1.add(nums[i]);
                        temp1.add(nums[j]);
                        temp1.add(nums[k]);
                        temp1.add((int) fourth);
                        Collections.sort(temp1);
                        res.add(temp1);
                    }
                    temp.add((long) nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(res);
        return ans;
    }
}