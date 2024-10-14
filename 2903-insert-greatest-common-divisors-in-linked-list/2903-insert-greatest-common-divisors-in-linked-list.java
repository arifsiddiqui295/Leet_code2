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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            int gcd = hcf(temp.val, temp.next.val);
            ListNode curr = new ListNode(gcd);
            curr.next = temp.next;
            temp.next = curr;
            temp = temp.next.next;
        }
        return head;
    }

    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }

}