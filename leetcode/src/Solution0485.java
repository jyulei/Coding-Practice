/**
 * 485. 最大连续 1 的个数
 */
public class Solution0485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = -1,j=0;j<nums.length;j++){
            if (nums[j] == 1) {
                if (i == -1) {
                    i=j;
                    max = Math.max(max,j-i+1);
                } else {
                    max = Math.max(max,j-i+1);
                }
            } else {
                i = -1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0}));
    }
}
