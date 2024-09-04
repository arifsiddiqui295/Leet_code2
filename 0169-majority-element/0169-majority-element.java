class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int ans = -1;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        for (var e : mp.entrySet()) {
            if (e.getValue() > n / 2) {
                ans = e.getKey();
            }
        }
        return ans;
    }
}