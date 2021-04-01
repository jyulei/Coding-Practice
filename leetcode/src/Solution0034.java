/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class Solution0034 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1,-1};
        }
        int left = 0, right = nums.length-1;
        int p = -1;
        while (left <= right) {
            int mid  = left +(right - left )/2;
            if (nums[mid] == target) {
                p = mid;
                break;
            } else if (nums[mid] > target) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        if (p == -1) {
            return new int[]{-1,-1};
        } else {
            for (left = p; left>=0; left--){
                if (nums[left]!=target){
                    break;
                }
            }
            for (right = p;right< nums.length;right++){
                if (nums[right]!=target){
                    break;
                }
            }
            return new int[]{left+1,right-1};
        }
    }
}
