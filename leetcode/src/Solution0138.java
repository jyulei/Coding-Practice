import jdk.nashorn.internal.ir.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 138. 复制带随机指针的链表
 */
public class Solution0138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node p = head.next;
        Node result = new Node(head.val);
        Node q = result;
        Map<Node,Node> map = new HashMap<>();
        map.put(head,result);
        while (p != null) {
            Node n = new Node(p.val);
            map.put(p,n);
            q.next = n;
            q = n;
            p = p.next;
        }
        p = head;
        q = result;
        while (p != null) {
            Node random = map.get(p.random);
            q.random = random;
            p = p.next;
            q = q.next;
        }
        return result;
    }
}
