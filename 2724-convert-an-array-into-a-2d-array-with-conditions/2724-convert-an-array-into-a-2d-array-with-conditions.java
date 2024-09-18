class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxRow = 0;
        int maxKey = -1;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > maxRow) {
                maxRow = map.get(num);
                maxKey = num;
            }
        }
        List<List<Integer>> al = new ArrayList<>();
        while (map.get(maxKey) > 0) {
            List<Integer> row = new ArrayList<>();
            for (var num : map.entrySet()) {
                if (num.getValue() > 0) {
                    row.add(num.getKey());
                    map.put(num.getKey(), num.getValue() - 1);
                }
            }
            al.add(row);
        }
        return al;
    }
}