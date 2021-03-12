import java.util.Arrays;

/**
 * 169. 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于⌊ n/2 ⌋的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素
 */
public class Solution0169 {
    /**
     * 首先想到的蠢方法
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int number = nums[0];
        int sum = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == number) {
                sum++;
            } else {
                if (sum > nums.length / 2){
                    return number;
                } else {
                    sum = 1;
                    number = nums[i];
                }
            }
        }
        return number;
    }

    /**
     *
     * @param nums
     * @return
     */
    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        int number = nums[0];
        int sum = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == number) {
                sum++;
            } else {
                if (sum > nums.length / 2){
                    return number;
                } else {
                    sum = 1;
                    number = nums[i];
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        majorityElement(nums);
        for (int i : nums){
            System.out.println(i);
        }
    }
}
