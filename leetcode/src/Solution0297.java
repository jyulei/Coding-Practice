import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 297. 二叉树的序列化与反序列化
 */
public class Solution0297 {

    public static class Codec {

        int p;

        Codec(){
            p=0;
        }

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
            boolean now=true,next=false;
            while(!q.isEmpty()){
                int size = q.size();
                while (size-- != 0) {
                    TreeNode p = q.poll();
                    if (p!=null){
                        s.append(p.val+",");
                        q.add(p.left);
                        q.add(p.right);
                        if (p.left != null||p.right!=null) {
                            next=true;
                        }
                    } else {
                        if (now){
                            s.append("null,");
                        }
                    }
                }
                now=next;
                next=false;
            }
            s.append("]");
            return s.toString();
        }

        //用一个全局的值代替现在的i，因为目前使用的是满二叉树来计算的下标。
        //序列化不是通过这样计算下标的
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            data=data.replace("[","");
            data=data.replace("]","");
            data.trim();
            if ("".equals(data)){
                return null;
            }
            String[] s = data.split(",");
            TreeNode res = new TreeNode(Integer.parseInt(s[p++]));
            Queue<TreeNode> q=new ArrayDeque<>();
            q.add(res);
            while (!q.isEmpty()){
                int size = q.size();
                while (size-- != 0) {
                    TreeNode node = q.poll();
                    if (p<s.length){
                        if ("null".equals(s[p])){
                            node.left=null;
                        } else {
                            node.left=new TreeNode(Integer.parseInt(s[p]));
                            q.add(node.left);
                        }
                        p++;
                    } else {
                        node.left=null;
                    }
                    if (p<s.length){
                        if ("null".equals(s[p])){
                            node.right=null;
                        } else {
                            node.right = new TreeNode(Integer.parseInt(s[p]));
                            q.add(node.right);
                        }
                        p++;
                    } else {
                        node.right=null;
                    }
                }
            }
            return res;
        }

        public static void main(String[] args) {
            Codec codec =new Codec();
            String s= "[1,2,3,null,null,4,5,6,7]";
            TreeNode res=codec.deserialize(s);
            System.out.println(1);
        }
    }



}
