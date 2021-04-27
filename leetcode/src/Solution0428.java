import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 428. 序列化和反序列化 N 叉树
 */
public class Solution0428 {

    class Codec {
        // Encodes a tree to a single string.
        public String serialize(Node root) {
            StringBuilder res = new StringBuilder();
            res.append("[");
            if (root != null) {
                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(new Node(-1,new LinkedList<>()));
                while (!q.isEmpty()) {
                    int size = q.size();
                    while (size-- != 0) {
                        Node p = q.poll();
                        if (p.val==-1){
                            res.append("null,");
                            continue;
                        } else {
                            res.append(p.val + ",");
                        }
                        for (Node i:p.children){
                            q.add(i);
                        }
                        q.add(new Node(-1,new LinkedList<>()));
                    }
                }
            }
            res.append("]");
            return res.toString();
        }

            // Decodes your encoded data to tree.
        public Node deserialize (String data){
            data= data.replace("[","");
            data= data.replace("]","");
            String[] s= data.split(",");
            Node root =null;
            Queue<Node> q =new LinkedList();
            if (s.length ==0) {
                return null;
            } else {
                root=new Node(Integer.parseInt(s[0]),new ArrayList<>());
                q.add(root);
                int index=2;
                while (!q.isEmpty()) {
                    Node p = q.poll();
                    if (index >= s.length) {
                        p.children = new ArrayList<>();
                    } else if ("null".equals(s[index])) {
                        p.children = new ArrayList<>();
                        index++;
                    } else {
                        List<Node> list = new ArrayList<>();
                        while (index < s.length && !"null".equals(s[index])) {
                            Node cur = new Node(Integer.parseInt(s[index]),new ArrayList<>());
                            list.add(cur);
                            q.add(cur);
                            index++;
                        }
                        p.children = list;
                        index++;
                    }
                }
            }
            return root;
        }


        class Node {
            public int val;
            public List<Node> children;

            public Node() {}

            public Node(int _val) {
                val = _val;
            }

            public Node(int _val, List<Node> _children) {
                val = _val;
                children = _children;
            }
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

