/**
 * 19. 删除链表的倒数第N个节点
 */
public class Solution0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        } else if (head.next == null) {
            return null;
        }
        ListNode fast,slow;
        fast = slow = head;
        while (n-- != 0 && fast != null) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
