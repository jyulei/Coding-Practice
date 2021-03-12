import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution0104 {
    //BFS
//    public int maxDepth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//        int max = 0;
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            max++;
//            int size = queue.size();
//            while(size-- != 0){
//                TreeNode treeNode = queue.remove();
//                if (treeNode.left != null) queue.add(treeNode.left);
//                if (treeNode.right != null) queue.add(treeNode.right);
//            }
//        }
//        return max;
//    }

    //DFS
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left) , maxDepth(root.right))+1;
    }
}
