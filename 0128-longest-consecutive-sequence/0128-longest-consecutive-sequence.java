class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> st1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st1.add(arr[i]);
        }
        int maxStreak = 0;
        for (var num : st1) {
            if (!st1.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;
                while (st1.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
}