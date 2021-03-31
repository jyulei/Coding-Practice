import java.util.Arrays;

/**
 * 33. 搜索旋转排序数组
 */
public class Solution0033 {
    public  int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[left] <= nums[mid]){
                if (nums[left]<=target && nums[mid]>target){
                    right = mid - 1;
                } else {
                    left = mid +1;
                }
            } else {
                if (nums[left] >target && nums[mid] < target){
                    left = mid +1 ;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

}
