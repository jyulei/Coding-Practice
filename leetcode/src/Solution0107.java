import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution0107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size-- != 0) {
                TreeNode treeNode = queue.remove();
                list.add(treeNode.val);
                if (treeNode.left != null) queue.add(treeNode.left);
                if (treeNode.right != null) queue.add(treeNode.right);
            }
            lists.add(list);
        }
        for (int i = 0; i < lists.size()/2 ; ++i){
            List<Integer> tmp = lists.get(i);
            lists.set(i,lists.get(lists.size()-1-i));
            lists.set(lists.size()-1-i,tmp);
        }
        return lists;
    }
}
