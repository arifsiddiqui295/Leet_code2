import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        // First pass: Find potential candidates
        for (int num : nums) {
            if (num == max1) {
                count1++;
            } else if (num == max2) {
                count2++;
            } else if (count1 == 0) {
                max1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                max2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == max1) {
                count1++;
            } else if (num == max2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if (count1 > nums.length / 3) {
            ans.add(max1);
        }
        if (count2 > nums.length / 3) {
            ans.add(max2);
        }
        
        return ans;
    }
}