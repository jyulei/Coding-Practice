import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 703. 数据流中的第 K 大元素
 */
public class Solution0703 {

    /**
     * 蠢蠢的方法一
     */
    static class KthLargest {
        private int k;
        private List<Integer> list;

        public KthLargest(int k, int[] nums) {
            Arrays.sort(nums);
            this.k = k;
            this.list = new LinkedList<Integer>();
            for (int i=nums.length-1;i>=0;i--){
                list.add(nums[i]);
            }
        }

        public int add(int val) {
            int i;
            for (i=0;i<list.size();i++){
                if(val>list.get(i)){
                    break;
                }
            }
            list.add(i,val);
            return list.get(k-1);
        }

        public static void main(String[] args) {
            int[] nums={4,5,8,2};
            int k=3;
            KthLargest res = new KthLargest(k,nums);
            res.add(3);
            res.add(5);
            res.add(10);
            res.add(9);
            res.add(4);
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
