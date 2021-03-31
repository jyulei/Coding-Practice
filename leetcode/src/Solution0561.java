import java.util.Arrays;

/**
 * 561. 数组拆分 I
 */
public class Solution0561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i<nums.length-1;i++){
            result += Math.min(nums[i],nums[i+1]);
        }
        return result;
    }
}
