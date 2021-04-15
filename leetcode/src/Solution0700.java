/**
 * 700. 二叉搜索树中的搜索
 */
public class Solution0700 {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode p= root;
        while (p != null) {
            if (p.val == val) {
                return p;
            } else if (p.val > val) {
                p=p.left;
            } else {
                p=p.right;
            }
        }
        return null;
    }
}
