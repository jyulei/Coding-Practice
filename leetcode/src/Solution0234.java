import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;

/**
 * 234. 回文链表
 */
public class Solution0234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode p = reverse(head);
        while (head != null) {

        }
        return false;
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
            q.next = p;
            p.next = q;
        }
        return p.next;
    }
}
