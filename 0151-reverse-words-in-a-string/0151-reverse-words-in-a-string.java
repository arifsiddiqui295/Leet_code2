class Solution {
    public String reverseWords(String s) {

        String trimmed = removeExtraSpaces(s);

        StringBuilder sb = new StringBuilder(trimmed);

        int start = 0;
        for (int end = 0; end < sb.length(); end++) {
            if (sb.charAt(end) == ' ') {
                reverse(sb, start, end - 1);
                start = end + 1;
            }
        }
        reverse(sb, start, sb.length() - 1);
        reverse(sb, 0, sb.length() - 1);

        return sb.toString();
    }

    static void reverse(StringBuilder s, int start, int end) {
        while (start < end) {
            char temp = s.charAt(start);
            s.setCharAt(start, s.charAt(end));
            s.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    private String removeExtraSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ')
            i++;

        while (i < n) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(' ');
            }
            i++;
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
