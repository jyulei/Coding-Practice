import java.util.*;

/**
 * 589. N 叉树的前序遍历
 */
public class Solution0589 {
    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        List<Integer> res =new ArrayList<>();
        if (root != null) {
            order(root,res);
        }
        return res;
    }

    private void order(Node root, List<Integer> res) {
        res.add(root.val);
        if (root.children == null) {
            return;
        } else {
            Iterator<Node> iterator=root.children.iterator();
            while (iterator.hasNext()) {
                order(iterator.next(),res);
            }
        }
    }

    /**
     * 迭代
     * @param root
     * @return
     */
     public List<Integer> preorder1(Node root) {
         List<Integer> res =new ArrayList<>();
         if (root == null) {
             return res;
         }
         Stack<Node> stack =new Stack<>();
         stack.add(root);
         while (!stack.empty()){
             Node p=stack.pop();
             res.add(p.val);
             Collections.reverse(p.children);
             for (Node q :p.children){
                 stack.add(q);
             }
         }
         return res;
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
