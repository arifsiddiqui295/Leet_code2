class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (var num : nums) {
            set.add(num);
        }
        int maxStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i] - 1;
            if (!set.contains(value)) {
                int currStreak = 0;
                value++;
                while (set.contains(value)) {
                    currStreak++;
                    value++;
                }
                maxStreak = Math.max(currStreak, maxStreak);
            }
        }
        return maxStreak;
    }
}