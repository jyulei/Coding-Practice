/**
 * 26. 删除排序数组中的重复项
 */
public class Solution0026 {
    public int removeDuplicates(int[] nums) {

        int i=0;
        for(int j=1;j<nums.length;++j) {
            if(nums[i]<nums[j]) {
                nums[i+1]=nums[j];
                i=i+1;
            }
        }
        return i+1;
    }
}
