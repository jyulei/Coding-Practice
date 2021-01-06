import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//    递归解法
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null){
//            return true;
//        } else if (p != null && q != null && p.val == q.val){
//            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
//        } else {
//            return false;
//        }
//    }

public class Solution0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        } else if (p == null) {
            return false;
        } else if (q == null) {
            return false;
        } else {
            Stack<TreeNode> stackP = new Stack<>();
            Stack<TreeNode> stackQ = new Stack<>();
            stackP.add(p);
            stackQ.add(q);
            while (!stackP.empty() || !stackP.empty()) {
                TreeNode p1 = stackP.pop();
                TreeNode q1 = stackQ.pop();
                if (q1 == null && p1 != null) {
                    return false;
                } else if (q1 != null && p1 ==null){
                    return false;
                } else if (q1 == null && p1 == null) {
                    continue;
                } else {
                    if (q1.val != p1.val) {
                        return false;
                    }
                    stackP.add(p1.right);
                    stackQ.add(q1.right);
                    stackP.add(p1.left);
                    stackQ.add(q1.left);
                }
            }
            return true;
        }
    }
}
