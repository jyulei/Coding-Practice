/**
 * 27. 移除元素
 */
public class Solution0027 {
    public int removeElement(int[] nums, int val) {

        int i,j;
        for(i=0,j=0;j<nums.length;++j) {
            if(nums[j]!=val) {
                nums[i]=nums[j];
                ++i;
            }
        }

        return i;
    }
}
