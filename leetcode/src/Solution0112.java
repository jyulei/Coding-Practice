import java.util.Stack;

/**
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 与运用递归的方法：通过从上倒下一个一个减去最后判断与叶子节点的值知否相等
 */
public class Solution0112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return dfs(root,sum);
    }

    private boolean dfs(TreeNode root, int sum) {
        if (root.left == null && root.right == null){
            if (sum == root.val){
                return true;
            } else {
                return false;
            }
        }
        if (root.left != null && root.right != null){
            return dfs(root.left,sum- root.val)||dfs(root.right,sum- root.val);
        } else if (root.left != null) {
            return dfs(root.left,sum- root.val);
        } else {
            return dfs(root.right,sum- root.val);
        }

    }
}
