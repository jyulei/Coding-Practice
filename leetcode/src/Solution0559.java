import java.util.List;

/**
 * 559. N 叉树的最大深度
 */
public class Solution0559 {
    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        int max=0;
        for (Node p :root.children){
            max=Math.max(max,maxDepth(p));
        }
        return max+1;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
