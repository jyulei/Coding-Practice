import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 703. 数据流中的第 K 大元素
 */
public class Solution0703 {

    /**
     * 蠢蠢的方法一
     */
    static class KthLargest {
        private int k;
        private PriorityQueue<Integer> heap;

        public KthLargest(int k, int[] nums) {
            this.k=k;
            heap=new PriorityQueue<>(k);
            for (int i=0;i<nums.length;i++){
                if (i<k){
                    heap.add(nums[i]);
                } else {
                    int tmp=heap.peek();
                    if (tmp<nums[i]){
                        heap.poll();
                        heap.add(nums[i]);
                    }
                }
            }
        }

        public int add(int val) {
            if(heap.size()<k) {
                heap.add(val);
            } else {
                int tmp=heap.peek();
                if (tmp<val){
                    heap.poll();
                    heap.add(val);
                }
            }
            return heap.peek();
        }

        public static void main(String[] args) {
            int[] nums={5,-1};
            int k=3;
            KthLargest res = new KthLargest(k,nums);
            res.add(2);
            System.out.println(res.heap.toString());
            res.add(1);
            System.out.println(res.heap.toString());
            res.add(-1);
            System.out.println(res.heap.toString());
            res.add(3);
            System.out.println(res.heap.toString());
            res.add(4);
            System.out.println(res.heap.toString());
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
