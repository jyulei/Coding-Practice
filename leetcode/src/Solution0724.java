import java.util.Map;

/**
 * 724.寻找数组的中心索引
 */
public class Solution0724 {
    public static int pivotIndex(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }
        int leftSum = 0;
        int rightSum = 0;
        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (leftSum == rightSum) {
                if (i==j) {
                    return i;
                }
            }
            int absL = Math.abs((leftSum + nums[i])-rightSum);
            int absR = Math.abs(leftSum - (rightSum + nums[j]));
            if ( absL < absR) {
                leftSum += nums[i];
                i++;
            } else {
                rightSum += nums[j];
                j--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }
}
