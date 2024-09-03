class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];
            if (mp1.containsKey(check)) {
                arr[0] = mp1.get(check);
                arr[1] = i;
            } else {
                mp1.put(nums[i], i);
            }
        }
        // System.out.println(arr[1]);
        return arr;
    }
}