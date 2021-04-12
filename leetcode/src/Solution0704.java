/**
 * 704、二分查找
 */
public class Solution0704 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    /**
     * 二分查找模板一
     * 二分查找的最基础和最基本的形式。
     * 查找条件可以在不与元素的两侧进行比较的情况下确定（或使用它周围的特定元素）。
     * 不需要后处理，因为每一步中，你都在检查是否找到了元素。如果到达末尾，则知道未找到该元素。
     * @param nums
     * @param target
     * @return
     */
    int binarySearch(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1;
        while(left <= right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid - 1; }
        }

        // End Condition: left > right
        return -1;
    }

    /**
     * 模板二
     * 用于查找需要访问数组中当前索引及其直接右邻居索引的元素或条件
     *
     * 一种实现二分查找的高级方法。
     * 查找条件需要访问元素的直接右邻居。
     * 使用元素的右邻居来确定是否满足条件，并决定是向左还是向右。
     * 保证查找空间在每一步中至少有 2 个元素。
     * 需要进行后处理。 当你剩下 1 个元素时，循环 / 递归结束。 需要评估剩余元素是否符合条件。
     * @param nums
     * @param target
     * @return
     */
    int binarySearch1(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length;
        while(left < right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid; }
        }

        // Post-processing:
        // End Condition: left == right
        if(left != nums.length && nums[left] == target) return left;
        return -1;
    }

    /**
     * 模板三
     * 用于搜索需要访问当前索引及其在数组中的直接左右邻居索引的元素或条件
     *
     * 实现二分查找的另一种方法。
     * 搜索条件需要访问元素的直接左右邻居。
     * 使用元素的邻居来确定它是向右还是向左。
     * 保证查找空间在每个步骤中至少有 3 个元素。
     * 需要进行后处理。当剩下 2 个元素时，循环 / 递归结束。 需要评估其余元素是否符合条件。
     * @param nums
     * @param target
     * @return
     */
    int binarySearch2(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1;
        while (left + 1 < right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        // Post-processing:
        // End Condition: left + 1 == right
        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        return -1;
    }
}
