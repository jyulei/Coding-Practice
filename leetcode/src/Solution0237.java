/**
 * 237. 删除链表中的节点
 */
public class Solution0237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
