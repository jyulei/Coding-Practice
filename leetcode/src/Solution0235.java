/**
 * 235. 二叉搜索树的最近公共祖先
 */
public class Solution0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min=Math.min(p.val,q.val);
        int max=Math.max(p.val,q.val);
        TreeNode cur=root;
        while (true){
            if (cur.val <= max &&cur.val > min) {
                return cur;
            } else if (cur.val<max&&cur.val>=min){
                return cur;
            } else if (cur.val > max) {
                cur=cur.left;
            } else {
                cur=cur.right;
            }
        }
    }
}
