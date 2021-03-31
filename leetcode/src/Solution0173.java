import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 173. 二叉搜索树迭代器
 */
public class Solution0173 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class BSTIterator {

        private List<TreeNode> list;
        private int index;

        public BSTIterator(TreeNode root) {
            list = new LinkedList<>();
            index = 0;
            inOrder(root,list);
        }

        private void inOrder(TreeNode root, List<TreeNode> list) {
            if (root == null){
                return;
            }
            inOrder(root.left,list);
            list.add(root);
            inOrder(root.right,list);
        }

        public int next() {
            return list.get(index++).val;
        }

        public boolean hasNext() {
            if (index>list.size()-1){
                return false;
            }else {
                return true;
            }
        }
    }

    class BSTIterator1 {

        private Queue<TreeNode> q;

        public BSTIterator1(TreeNode root) {
            q = new LinkedList<>();
            if (root == null) {
                return;
            }
            Stack<TreeNode> s = new Stack();
            TreeNode p = root;
            while (p != null || !s.empty()){
                while (p != null) {
                    s.push(p);
                    p = p.left;
                }
                p =s.pop();
                q.add(p);
                p = p.right;
            }
        }

        public int next() {
            return q.poll().val;
        }

        public boolean hasNext() {
            return q.isEmpty() ? false: true;
        }
    }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
}
