/**
 * 142. 环形链表 II
 */
public class Solution0142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode  p = head;
                while (p != slow) {
                    p =p.next;
                    slow = slow.next;
                }
                return p;
            }
        }
        return null;
    }
}
