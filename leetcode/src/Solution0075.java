/**
 * 75. 颜色分类
 */
public class Solution0075 {
    public void sortColors(int[] nums) {
        int i=0,k=nums.length-1,j;
        for (j=0;j<nums.length;j++){
            int tmp=nums[j];
            if (tmp == 0) {
                if (j != i) {
                    nums[j]=nums[i];
                    nums[i]=tmp;
                    j--;  //为了将换过来元素进行一次判断
                }
                i++;
            } else if (tmp==2){
                if (j != k) {
                    nums[j]=nums[k];
                    nums[k]=tmp;
                    j--;
                }
                k--;
            }
            if (j>k){
                break;
            }
        }
    }
}
