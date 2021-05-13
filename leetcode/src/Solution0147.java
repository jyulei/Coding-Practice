/**
 * 147. 对链表进行插入排序
 */
public class Solution0147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode Head = new ListNode();
        Head.next=head;
        ListNode p,pre=head,q=head.next;
        while (q!=null){
            p=Head;
            while (p.next.val<=q.val&&p.next!=q){
                p=p.next;
            }
            if (p.next == q) {
                pre=q;
                q=q.next;
            } else {
                pre.next=q.next;
                q.next=p.next;
                p.next=q;
                q=pre.next;
            }
        }
        return Head.next;
    }
}
