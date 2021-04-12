import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历
 */
public class Solution0145 {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    private void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            postorder(root.left, list);
            postorder(root.right, list);
            list.add(root.val);
        }
    }

    /**
     * 非递归
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        TreeNode p = root, q = null;
        Stack<TreeNode> s = new Stack<>();
        while (!s.empty() || p != null) {
            while (p != null) {
                s.add(p);
                p = p.left;
            }
            p = s.peek();
            if (p.right == null || p.right == q) {
                list.add(p.val);
                s.pop();
                q = p;
                p = null;
            } else {
                p=p.right;
            }
        }
        return list;
    }
}
