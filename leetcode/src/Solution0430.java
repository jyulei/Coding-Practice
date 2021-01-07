import java.util.Stack;

/**
 * 430. 扁平化多级双向链表
 */
public class Solution0430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node result = new Node();
        Node p = result;
        Stack<Node> s = new Stack<>();
        s.add(head);
        while (!s.isEmpty()) {
            Node q = s.pop();
            p.next = q;
            q.prev = p;
            p = q;
            while (q.child == null && q.next != null ) {
                q = q.next;
                p = q;
            }
            if (q.child != null) {
                if (q.next != null) {
                    s.push(q.next);
                }
                s.push(q.child);
                q.child = null;
            }
        }
        result.next.prev=null;
        return result.next;
    }
}
