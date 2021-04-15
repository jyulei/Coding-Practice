/**
 * 215. 数组中的第K个最大元素
 */
public class Solution0215 {
    public int findKthLargest(int[] nums, int k) {
        for (int i =0;i<k;i++){
            for (int j=0;j<nums.length-2-i;j++){
                if (nums[j]>nums[j+1]){
                    int tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
        return nums[nums.length-k];
    }
}
