/**
 * 283. 移动零
 */
public class Solution0283 {
    public void moveZeroes(int[] nums) {
        int i,j;
        i = 0;
        for (j = 0; j <nums.length;j++){
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
