/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        int check = 1;
        int first = 1;
        ListNode lastZero = head;
        ListNode lastZeroHead = head;
        int sum = 0;
        while (temp != null) {
            if (temp.val != 0) {
                sum = sum + temp.val;
            } else if (check == 2) {
                temp.val = sum;
                if (first == 1) {
                    lastZeroHead = temp;
                    lastZero = temp;
                    first = 2;
                } else {
                    lastZero.next = temp;
                    lastZero = temp;
                }
                sum = 0;
            } else {
                check = 2;
            }
            temp = temp.next;
        }
        return lastZeroHead;
    }
}