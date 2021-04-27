import java.util.*;

/**
 * 652. 寻找重复的子树
 */
public class Solution0652 {

    Map<String,Integer> map;
    List<TreeNode> list;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map=new HashMap<>();
        list =new ArrayList<>();
        if (root!=null){
            serialize(root);
        }
        return list;
    }

    public String serialize(TreeNode p){
        if (p==null){
            return "$";
        }
        String s="";
        s = p.val+","+serialize(p.left)+","+serialize(p.right);
        map.put(s,map.getOrDefault(s,0)+1);
        if (map.get(s)==2){
            list.add(p);
        }
        return s;
    }
}
