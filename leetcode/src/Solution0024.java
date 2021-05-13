/**
 * 24. 两两交换链表中的节点
 */
public class Solution0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode p=head;
        ListNode res=head;
        ListNode pre=null;
        while (p != null && p.next != null) {
            ListNode q=p.next;
            p.next=q.next;
            q.next=p;
            if (pre==null){
                res=q;
                pre=p;
            } else {
                pre.next=q;
            }
            p=pre.next;
        }
        return res;
    }
}
