/**
 * 270. 最接近的二叉搜索树值
 */
public class Solution0270 {
    public int closestValue(TreeNode root, double target) {
        int res = root.val;
        TreeNode p = root;
        while (p != null) {
            res = Math.abs(target- p.val)<Math.abs(target-res)?p.val:res;
            if (p.val == target) {
                return res;
            } else if (p.val > target) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        return res;
    }
}
