/**
 * 53. 最大子序和
 */
public class Solution0053 {
    public int maxSubArray(int[] nums) {
        int max;
        int pre;
        pre = 0;
        max = nums[0];
        for (int i = 0;i<nums.length;i++){
            pre = Math.max(pre+nums[i],nums[i]);
            max = Math.max(pre,max);
        }
        return max;
    }
}
