public class Solution0108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return turn(nums,0,nums.length-1);
    }

    public TreeNode turn(int[] nums,int start,int end) {
        if (start>end) {
            return null;
        }
        int mid =  (start + end) >> 1;
        TreeNode treeNode = new TreeNode();
        treeNode.val = nums[mid];
        treeNode.left = turn(nums,start,mid-1);
        treeNode.right = turn(nums,mid+1,end);
        return treeNode;
    }
}
