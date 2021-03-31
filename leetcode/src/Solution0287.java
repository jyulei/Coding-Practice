import java.util.Arrays;

/**
 * 287. 寻找重复数
 */
public class Solution0287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * 使用二分法查找
     *
     * @param nums
     * @return
     */
    public int findDuplicate1(int[] nums) {
        int left = 1, right = nums.length-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
