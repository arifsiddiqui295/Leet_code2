class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a' + 1;
            sb.append(c);
        }

        String numStr = sb.toString();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char ch : numStr.toCharArray()) {
                sum += ch - '0';
            }
            numStr = Integer.toString(sum);
        }

        return sum;
    }
}