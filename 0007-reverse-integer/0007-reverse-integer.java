class Solution {
    public int reverse(int x) {
        int newDigit = 0;
        while (x != 0) {
            int rem = x % 10;

            // Check for overflow before multiplying newDigit by 10
            if (newDigit > Integer.MAX_VALUE / 10 || (newDigit == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (newDigit < Integer.MIN_VALUE / 10 || (newDigit == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Overflow case for negative numbers
            }

            newDigit = newDigit * 10 + rem;
            x = x / 10;
        }

        return newDigit;
    }
}
