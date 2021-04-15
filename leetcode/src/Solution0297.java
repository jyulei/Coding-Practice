import java.util.LinkedList;
import java.util.Queue;

/**
 * 297. 二叉树的序列化与反序列化
 */
public class Solution0297 {

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder s = new StringBuilder();
            s.append('[');
            if (root == null) {
                s.append(']');
                return s.toString();
            }
            Queue<TreeNode> q =new LinkedList<>();
            q.add(root);
            s.append(root.val);
            while(!q.isEmpty()){
                int size = q.size();
                while (size-- != 0) {
                    TreeNode p = q.poll();
                    if (p!=null){
                        q.add(p.left);
                        if (p.left == null) {
                            s.append(",null");
                        }
                        q.add(p.right);
                        if (p.right == null) {
                            s.append(",null");
                        }
                    }
                }
            }
            return s.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            data.replace('[',' ');
            data.replace(']',' ');
            data.trim();
            if ("".equals(data)){
                return null;
            }
            String[] s = data.split(",");
            TreeNode res = new TreeNode(Integer.parseInt(s[0]));
            res.left=build(s,1);
            res.right=build(s,2);
            return null;
        }

        private TreeNode build(String[] s, int i) {
            if (i>=s.length){
                return null;
            } else if ("null".equals(s[i])){
                return null;
            } else {
                TreeNode p= new TreeNode(Integer.parseInt(s[i]));
//                p.left=build(s,)
            }
            return null;
        }
    }

}
