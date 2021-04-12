import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 */
public class Solution0144 {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    private void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            list.add(root.val);
            preorder(root.left, list);
            preorder(root.right, list);
        }
    }

    /**
     * 非递归
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        while (!s.empty()) {
            TreeNode p = s.pop();
            list.add(p.val);
            if (p.right != null) {
                s.add(p.right);
            }
            if (p.left != null) {
                s.add(p.left);
            }
        }
        return list;
    }
}
