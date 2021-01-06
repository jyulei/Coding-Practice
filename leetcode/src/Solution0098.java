/**
 * 98. 验证二叉搜索树
 */
public class Solution0098 {
    public boolean isValidBST(TreeNode root) {
        return judge(root,null,null);
    }
    boolean judge(TreeNode root,Integer min,Integer max){
        if (root == null) {
           return true;
        }
        if (min == null && max == null) {
            return judge(root.left,null,root.val)&&judge(root.right,root.val,null);
        }
        if (min == null) {
            if (root.val >= max) {
                return false;
            } else {
                return judge(root.left,null,root.val)&&judge(root.right,root.val,max);
            }
        }
        if (max == null) {
            if (root.val <= min) {
                return false;
            } else {
                return judge(root.left,min,root.val)&&judge(root.right,root.val,null);
            }
        }
        if (root.val <= min || root.val >= max) {
            return false;
        } else {
            return judge(root.left,min,root.val)&&judge(root.right,root.val,max);
        }
    }
}
