/**
 * 162. 寻找峰值
 */
public class Solution0162 {
    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == 0) {
                if (nums[mid] > nums[mid + 1]) {
                    result = mid;
                    break;
                } else {
                    left++;
                    continue;
                }
            }
            if (mid == nums.length - 1) {
                if (nums[mid] > nums[mid - 1]) {
                    result = mid;
                    break;
                } else {
                    right++;
                    continue;
                }
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                result = mid;
                break;
            } else {
                if (nums[mid] < nums[mid - 1]) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }
        return result;
    }

    public int findPeakElement1(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int left = 0, right = nums.length -1 ;
        while (left+1 < right) {
            int mid = left +(right -left)/2;
            if (nums[mid]>nums[mid-1]&& nums[mid]>nums[mid+1]){
                return mid;
            } else if (nums[mid]<nums[mid-1]){
                right=mid;
            } else {
                left = mid;
            }
        }
        if (nums[left]>nums[right]){
            return left;
        } else {
            return right;
        }
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3}));
    }
}
