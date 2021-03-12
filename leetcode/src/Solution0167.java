/**
 * 167. 两数之和 II - 输入有序数组
 * 给定一个已按照升序排列的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1必须小于index2。
 */
public class Solution0167 {
    /**
     * 双指针
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int result1 = 0;
        int result2 = numbers.length-1;
        while (result1 < result2) {
            if (numbers[result1] + numbers[result2] == target) {
                int[] result = new int[2];
                result[0] = result1 + 1;
                result[1] = result2 + 1;
                return result;
            } else if (numbers[result1] + numbers[result2] < target) {
                result1++;
            } else {
                result2--;
            }
        }
        return null;
    }
}
