/**
 * 450. 删除二叉搜索树中的节点
 */
public class Solution0450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode p =root;
        TreeNode pre = null;
        boolean d = false;
        while (p != null) {
            if (p.val == key) {
                break;
            } else if (p.val < key) {
                pre=p;
                p=p.right;
                d= true;
            } else {
                pre=p;
                p=p.left;
                d=false;
            }
        }
        //没有找到
        if (p == null) {
            return root;
        }
        //如果是根节点
        if (p == root) {
            if (p.left == null && p.right == null) {
                return null;
            } else if (p.left == null) {
                return p.right;
            } else if (p.right == null) {
                return p.left;
            } else {
                if (p.right.left == null) {
                    p.right.left=p.left;
                    return p.right;
                } else {
                    pre=p.right;
                    p=pre.left;
                    while (p.left != null) {
                        pre=p;
                        p=pre.left;
                    }
                    root.val=p.val;
                    pre.left=null;
                    return root;
                }
            }
        }
        //不是跟节点
        //有两个孩子
        if (p.left != null && p.right != null) {
            if (p.right.left == null) {
                p.right.left=p.left;
                if (d) {
                    pre.right=p.right;
                } else {
                    pre.left=p.right;
                }
                return root;
            } else {
                TreeNode cur=p;
                pre=p.right;
                p=pre.left;
                d=false;
                while (p.left != null) {
                    pre=p;
                    p=pre.left;
                }
                cur.val=p.val;
            }
        }
        //如果是叶子节点
        if (p.left == null && p.right == null) {
            if (d) {
                pre.right=null;
            } else {
                pre.left=null;
            }
        }
        //不是叶子节点，有一个孩子
        if (p.left != null) {
            if (d) {
                pre.right=p.left;
            } else {
                pre.left=p.left;
            }
        }
        if (p.right != null) {
            if (d) {
                pre.right=p.right;
            } else {
                pre.left=p.right;
            }
        }
        return root;
    }
}
