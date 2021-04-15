import java.util.LinkedList;
import java.util.Queue;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 */
public class Solution0116 {
    /**
     * 层次遍历 空间复杂度大
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int num = q.size();
            Node p = null;
            while (num != 0) {
                Node cur = q.poll();
                if (cur.left != null) {
                    q.add(cur.left);
                    q.add(cur.right);
                }
                if (p == null) {
                    p = cur;
                } else {
                    p.next=cur;
                    p=p.next;
                }
                num--;
            }
            p.next=null;
        }
        return root;
    }

    /**
     * 一种空间为常数的算法
     * @param root
     * @return
     */
    public Node connect1(Node root) {
        return root;
    }


    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
