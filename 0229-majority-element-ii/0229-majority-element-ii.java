class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        int n = nums.length / 3;
        for (var e : freq.entrySet()) {
            if (e.getValue() > n) {
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}