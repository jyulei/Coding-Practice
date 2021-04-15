/**
 * 剑指 Offer 68 - II. 二叉树的最近公共祖先
 */
public class Solution0236 {
    private TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean left=false ,right=false;
        judge(root,p,q);
        return res;
    }

    private boolean judge(TreeNode root, TreeNode p,TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean l,r,cur;
        l=judge(root.left,p,q);
        r=judge(root.right,p,q);
        cur=p==root||q==root?true:false;
        if (l == true && r == true || l==true&&cur==true || r==true&&cur==true) {
            if (res == null) {
                res=root;
            }
        }
        return l||r||cur;
    }
}
