import java.util.Stack;

public class Solution0101 {
    //递归解法
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null){
//            return true;
//        }else {
//            return judge(root.left,root.right);
//        }
//    }
//
//    private boolean judge(TreeNode left, TreeNode right) {
//        if (left == null && right == null){
//            return true;
//        } else if (left == null){
//            return false;
//        } else if (right == null) {
//            return false;
//        } else if (left.val == right.val){
//            return judge(left.left,right.right)&&judge(left.right,right.left);
//        } else {
//            return false;
//        }
//    }

    //迭代解法
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root.left);
        stack.add(root.right);
        while (!stack.empty()){
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if (left == null && right == null){
                continue;
            } else if (left == null) {
                return false;
            } else if (right == null) {
                return false;
            } else {
                if (left.val != right.val){
                    return false;
                } else {
                    stack.add(left.left);
                    stack.add(right.right);
                    stack.add(left.right);
                    stack.add(right.left);
                }
            }
        }
        return true;
    }
}
