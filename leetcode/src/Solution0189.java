/**
 * 189. 旋转数组
 */
public class Solution0189 {
    /**
     * 暴力破解
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return;
        }
        for (int i = 0;i<k;i++){
            int tmp = nums[nums.length-1];
            for (int p = nums.length-1; p >0; p--){
                nums[p] = nums[p-1];
            }
            nums[0] = tmp;
        }
    }

    /**
     * 额外数组
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return;
        }
        for (int i = 0;i<k;i++){
            int tmp = nums[nums.length-1];
            for (int p = nums.length-1; p >0; p--){
                nums[p] = nums[p-1];
            }
            nums[0] = tmp;
        }
    }

    /**
     * 环带求解
     * @param nums
     * @param k
     */
    public void rotate3(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return;
        }
        for (int i = 0;i<k;i++){
            int tmp = nums[nums.length-1];
            for (int p = nums.length-1; p >0; p--){
                nums[p] = nums[p-1];
            }
            nums[0] = tmp;
        }
    }

    /**
     * 翻转求解
     * @param nums
     * @param k
     */
    public void rotate4(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return;
        }
        for (int i = 0;i<k;i++){
            int tmp = nums[nums.length-1];
            for (int p = nums.length-1; p >0; p--){
                nums[p] = nums[p-1];
            }
            nums[0] = tmp;
        }
    }
}
