/**
 * 35. 搜索插入位置
 */
public class Solution0035 {
    public int searchInsert(int[] nums, int target) {

    int low, mid, high;
    low = 0;
    high = nums.length - 1;
    mid = (high + low) >> 1;
    while (low <= high) {
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] > target) {
            high = mid - 1;
            mid = (high + low) >> 1;
        } else {
            low = mid + 1;
            mid = (high + low) >> 1;
        }
    }
    return low;
}
}
