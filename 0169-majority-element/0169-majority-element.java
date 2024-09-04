class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxElem = arr[0];
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                maxElem = arr[i];
                count = 1;
            } else if (maxElem == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxElem==arr[i]) freq++;
        }

        if (freq > n/2) {
            ans = maxElem;
        }
        return ans;
    }
}