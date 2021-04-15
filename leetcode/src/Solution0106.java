/**
 * 106. 从中序与后序遍历序列构造二叉树
 */
public class Solution0106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null) {
            return null;
        }
        TreeNode res = null;
        res = buildSubTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        return res;
    }

    private TreeNode buildSubTree(int[] inorder, int inL, int inR, int[] postorder, int poL, int poR) {
        if (poR < poL) {
            return null;
        } else {
            TreeNode p = new TreeNode();
            p.val = postorder[poR];
            int i;
            for (i = inL; i <= inR; i++) {
                if (inorder[i] == p.val) {
                    break;
                }
            }
            int leftNum = i - inL;
            p.left = buildSubTree(inorder, inL, inL + leftNum - 1, postorder, poL, poL + leftNum - 1);
            p.right = buildSubTree(inorder, i + 1, inR, postorder, poL + leftNum, poR - 1);
            return p;
        }
    }
}
