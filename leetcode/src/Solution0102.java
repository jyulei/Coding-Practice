import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102.二叉树的层序遍历
 */
public class Solution0102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null ){
            return result;
        }
        Queue<TreeNode> re = new LinkedList<>();
        re.add(root);
        while (!re.isEmpty()) {
            int length = re.size();
            List<Integer> l = new ArrayList<>();
            while (length-- != 0) {
                TreeNode t = re.poll();
                l.add(t.val);
                if (t.left != null) {
                    re.add(t.left);
                }
                if (t.right != null) {
                    re.add(t.right);
                }
            }
            result.add(l);
        }
        return result;
    }
}
