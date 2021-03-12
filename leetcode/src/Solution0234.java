/**
 * 234. 回文链表
 */
public class Solution0234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast ,slow ;
        slow = head;
        fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        ListNode p = head,q = slow.next;
        while (q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
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
