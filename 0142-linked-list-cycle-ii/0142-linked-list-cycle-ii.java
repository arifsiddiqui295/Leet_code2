/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (slow != null)
                slow = slow.next;
            if (fast.next != null)
                fast = fast.next.next;
            if (slow == fast)
                break;
        }
        ListNode temp = head;
        while (temp != slow) {
            if (temp != null)
                temp = temp.next;
            if (slow != null)
                slow = slow.next;
        }
        return slow;
    }
}