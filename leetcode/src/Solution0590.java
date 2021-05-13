import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 590. N 叉树的后序遍历
 */
public class Solution0590 {

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {
        List<Integer> res =new ArrayList<>();
        if (root==null){
            return res;
        }
        Stack<Node> stack =new Stack<>();
        List<Node> cur=null;
        stack.add(root);
        while (!stack.empty()){
            Node p = stack.peek();
            if (p.children!=cur){
                Collections.reverse(p.children);
                for (Node q: p.children){
                    stack.add(q);
                }
            } else {
                Node q = stack.pop();

                res.add(stack.pop().val);
            }
        }
        return null;
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> postorder1(Node root) {
        List<Integer> res =new ArrayList<>();
        if (root != null) {
            order(root,res);
        }
        return res;

    }

    private void order(Node root, List<Integer> res) {
        for (Node p: root.children){
            order(p,res);
        }
        res.add(root.val);
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
