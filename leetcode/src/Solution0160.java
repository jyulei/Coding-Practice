/**
 * 160. 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class Solution0160 {
    /**
     * 我的暴力破解
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b= headB;
        while (a != null) {
            while (b != null) {
                if (a == b) {
                    return a;
                }
                b = b.next;
            }
            a = a.next;
            b=headB;
        }
        return null;
    }

    /**
     * 一种可以使时间复杂度降到n，空间复杂度为常数的算法
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int aLength = 0;
        int bLength = 0;
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            aLength++;
            a = a.next;
        }
        while (b != null) {
            bLength++;
            b = b.next;
        }
        //移动指针至头部
        a = headA;
        b = headB;
        if (aLength > bLength) {
            int gap = aLength - bLength;
            while (gap-- != 0) {
                a = a.next;
            }
        } else {
            int gap = bLength - aLength;
            while (gap-- != 0) {
                b = b.next;
            }
        }
        while (a != null) {
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }

}
