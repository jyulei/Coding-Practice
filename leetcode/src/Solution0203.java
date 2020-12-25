/**
 *  203. 移除链表元素
 *  删除链表中等于给定值 val 的所有节点。
 */
public class Solution0203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = new ListNode();
        ListNode q = p;
        p.next = head;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return q.next;
    }
}
