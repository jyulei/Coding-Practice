/**
 * 328.奇偶链表
 */
public class Solution0328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();
        ListNode p = head1;
        ListNode q = head2;
        ListNode k;
        int i = 0;
        while (head != null) {
            i++;
            k = head;
            head = head.next;
            k.next = null;
            if (i % 2 == 0) {
                q.next = k;
                q = k;
            } else {
                p.next = k;
                p = k;
            }
        }
        p.next = head2.next;
        return head1.next;
    }
}
