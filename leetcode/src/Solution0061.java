/**
 * 61. 旋转链表
 */
public class Solution0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p= p.next;
        }
        k = k % length;
        ListNode fast = head,slow = head;
        while (k-- != 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        p = slow.next;
        slow.next = null;
        head = reverse(head);
        p = reverse(p);
        ListNode a=head;
        while (a.next != null) {
            a =a.next;
        }
        a.next = p;
        head = reverse(head);
        return head;
    }

    private ListNode reverse(ListNode head) {
        ListNode p = new ListNode();
        ListNode q;
        while (head != null) {
            q = head;
            head = head.next;
            q.next = p.next;
            p.next = q;
        }
        return p.next;
    }


}
