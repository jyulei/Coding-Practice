/**
 * 80. 删除有序数组中的重复项 II
 */
public class Solution0080 {
    public int removeDuplicates(int[] nums) {
        int i,j,k;   //i用来记录位置，j用来遍历，k用来记数
        i=0;
        k=1;
        for (j=1;j<nums.length;j++){
            if (nums[j]!=nums[i]){
                nums[++i]=nums[j];
                k=1;
            } else {
                if (k != 2) {
                    k++;
                    nums[++i]=nums[j];
                }
            }
        }
        return i+1;
    }
}
