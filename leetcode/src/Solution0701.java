/**
 * 701. 二叉搜索树中的插入操作
 */
public class Solution0701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            TreeNode p=root;
            while (true){
                if (p.val < val) {
                    if (p.right == null) {
                        p.right= new TreeNode(val);
                        break;
                    } else {
                        p=p.right;
                    }
                } else {
                    if (p.left == null) {
                        p.left= new TreeNode(val);
                        break;
                    } else {
                        p=p.left;
                    }
                }
            }
        }
        return root;
    }
}
