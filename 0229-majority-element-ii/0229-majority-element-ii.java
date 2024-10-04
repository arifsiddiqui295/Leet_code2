class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (var num : map.entrySet()) {
            if (num.getValue() > nums.length / 3) {
                ans.add(num.getKey());
            }
        }
        return ans;
    }
}