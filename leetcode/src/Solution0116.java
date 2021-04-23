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
     * 递归算法
     * @param root
     * @return
     */
    public Node connect1(Node root) {
        if (root == null) {
            return root;
        }
        root.next=null;
        build(root);
        return root;
    }

    private void build(Node p) {
        if (p.left == null) {
            return;
        }
        p.left.next=p.right;
        if (p.next != null) {
            p.right.next=p.next.left;
        } else {
            p.right.next=null;
        }
        build(p.left);
        build(p.right);
    }

    /**
     * 一种空间为常数的算法
     * @param root
     * @return
     */
    public Node connect2(Node root) {
        if (root == null) {
            return root;
        }
        root.next=null;
        Node pre,p,preB,pB;  //p为正在进行操作层节点的第一个，pre为p的父亲，preB和pB，用来遍历这一层
        pre=root;
        p=pre.left;
        while (p != null) {
            preB=pre;
            pB=p;
            while (preB != null) {
                pB.next=preB.right;
                pB=pB.next;
                if (preB.next == null) {
                    pB.next=null;
                } else {
                    pB.next=preB.next.left;
                    pB=pB.next;
                }
                preB=preB.next;
            }
            pre=p;
            p=pre.left;
        }
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
