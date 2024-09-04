class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }
        List<Integer> al = new ArrayList<>();

        for (var e : mp.entrySet()) {
            if (e.getValue() > n / 3) {
                al.add(e.getKey());
            }
        }
        return al;
    }
}