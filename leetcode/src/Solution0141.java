public class Solution0141 {
    public boolean hasCycle(ListNode head) {
        //通过快慢指针来解决这一问题
        if (head == null) {
            return false;
        } else if (head.next == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            if (fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
