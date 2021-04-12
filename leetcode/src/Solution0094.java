import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 */
public class Solution0094 {
    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inorder(root,list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }

    /**
     * 非递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        if (root == null) {
            return list;
        }
        TreeNode p = root;
        Stack<TreeNode> s = new Stack<>();
        while (!s.empty() || p != null) {
            while (p != null) {
                s.add(p);
                p=p.left;
            }
            p = s.pop();
            list.add(p.val);
            p = p.right;
        }
        return list;
    }
}
