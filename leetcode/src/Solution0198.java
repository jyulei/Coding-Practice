/**
 * 198. 打家劫舍
 *
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution0198 {
    /**
     * 通过两次遍历，第一次遍历找到最大的，第二次找到合适的第二大的数
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        int sumLast,sumNow; //sumLast表示从开始偷窃到现在当前位置不投的最大值；sumNow表示从开始偷窃到现在当前位置投的最大值
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        sumLast = nums[0];
        sumNow = nums[1];
        for (int i = 2;i<nums.length;i++){
            int sl = sumLast;
            sumLast = Math.max(sumLast,sumNow);
            sumNow = sl + nums[i];
        }
        return Math.max(sumLast,sumNow);
    }

    public static void main(String[] args) {

    }
}
