class Solution {
    public boolean rotateString(String s, String goal) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder gb = new StringBuilder(goal);
        while (count < sb.length()) {
            char x = sb.charAt(sb.length() - 1);
            for (int i = sb.length() - 1; i > 0; i--) {
             sb.setCharAt(i, sb.charAt(i - 1));
            }
            sb.setCharAt(0,x);
            if (sb.toString().equals(gb.toString()))
                return true;
            else
                count++;
        }
        return false;
    }
}