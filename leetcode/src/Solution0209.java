/**
 * 209. 长度最小的子数组
 */
public class Solution0209 {
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = 0;
        int sum = 0;
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (sum < target) {
                sum +=nums[j];
            } else if (sum >= target) {
                if (min == 0) {
                    min = j-i;
                } else {
                    min = Math.min(min,j-i);
                }
                j--;
                sum -= nums[i];
                i++;
            }
        }
        while (sum>=target) {
            if (min == 0) {
                min = nums.length-i;
            } else {
                min = Math.min(min,nums.length-i);
            }
            sum -= nums[i];
            i++;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
}
