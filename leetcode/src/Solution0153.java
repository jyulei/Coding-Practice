/**
 * 153. 寻找旋转排序数组中的最小值
 */
public class Solution0153 {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int min = nums[0];
        for (int i = 1;i<nums.length;i++){
            if (min<nums[i]){
                continue;
            } else {
                min =  nums[i];
                break;
            }
        }
        return min;
    }

    /**
     * 二分法
     * @param nums
     * @return
     */
    public int findMin1(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[left] > nums[mid]){
                right = mid;
            } else {
                left = mid;
            }
        }
        return left + 1;
    }
}
