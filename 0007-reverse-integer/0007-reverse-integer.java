class Solution {
    public int reverse(int x) {
        int newDigit = 0;
        int check = 0;
        if (x < 0) {
            x = x * -1;
            check = 1;
        }
        while (x != 0) {
            int rem = x % 10;
            if (newDigit > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            if (newDigit > (Integer.MAX_VALUE)) {
                return 0;
            }
            newDigit = newDigit * 10 + rem;
            x = x / 10;
        }

        if (check == 1) {
            return newDigit * -1;
        }
        return newDigit;
    }
}
