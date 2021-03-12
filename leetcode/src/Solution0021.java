/**
 * 21. 合并两个有序链表
 */
public class Solution0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode r = l;
        while(l1!=null&&l2!=null) {
            if(l1.val<l2.val) {
                l.next = l1;
                l1=l1.next;
            }else if(l1.val>l2.val){
                l.next = l2;
                l2=l2.next;
            }else {
                l.next = l1;
                l1=l1.next;
                l=l.next;
                l.next=l2;
                l2=l2.next;
            }
            l=l.next;
        }
        if(l1!=null) {
            l.next=l1;
        }
        if(l2!=null) {
            l.next=l2;
        }
        return r.next;
    }
}
