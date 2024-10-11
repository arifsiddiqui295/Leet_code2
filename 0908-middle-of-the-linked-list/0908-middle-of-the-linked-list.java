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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size % 2 == 0) {
            size = size / 2;
        } else {
            size = (size / 2);
        }
        temp = head;
        int count = 0;
        while (count != size) {
            count++;
            temp = temp.next;
        }
        return temp;
    }
}