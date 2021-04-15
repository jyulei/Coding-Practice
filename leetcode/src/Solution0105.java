/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class Solution0105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode res = null;
        res = buildSubTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return res;
    }

    private TreeNode buildSubTree(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {
        if (preL > preR) {
            return null;
        } else {
            TreeNode p= new TreeNode();
            p.val = preorder[preL];
            int i;
            for (i=inL;i<=inR;i++){
                if (inorder[i] == p.val) {
                    break;
                }
            }
            int leftNum = i-inL;
            p.left = buildSubTree(preorder,preL+1,preL+leftNum,inorder,inL,inL+leftNum);
            p.right=buildSubTree(preorder,preL+leftNum+1,preR,inorder,i+1,inR);
            return p;
        }
    }
}
