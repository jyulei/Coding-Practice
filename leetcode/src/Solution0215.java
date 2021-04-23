import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最大元素
 */
public class Solution0215 {

    public int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(k);
        for (int i=0;i<nums.length;i++){
            if (i >= k) {
                int tmp=heap.peek();
                if (tmp<nums[i]){
                    heap.poll();
                    heap.add(nums[i]);
                }
            } else {
                heap.add(nums[i]);
            }
        }
        return heap.peek();
    }

    /**
     * 暴力，low
     * @param nums
     * @param k
     * @return
     */
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
