class Solution {
    public int reverse(int x) {
        int newdigit = 0;
        int check = 0;
        if (x < 0) {
            x = x * -1;
            check = 1;
        }
        while (x != 0) {
            int rem = x % 10;
            if (newdigit > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            newdigit = newdigit * 10 + rem;
            x = x / 10;
        }
        if (check == 1) {
            newdigit = newdigit * -1;
            return newdigit;
        }
        return newdigit;
    }
}