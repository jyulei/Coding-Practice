public class Solution0110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(height(root.left)-height(root.right))<=1){
            return isBalanced(root.left)&&isBalanced(root.right);
        } else {
            return false;
        }
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left)+1,height(node.right)+1);
    }

}
