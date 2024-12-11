class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (var e : map.entrySet()) {
            if (e.getValue() > n / 2) {
                ans = e.getKey();
                break;
            }
        }
        return ans;
    }
}