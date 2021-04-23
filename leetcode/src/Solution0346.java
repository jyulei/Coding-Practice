import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 346、数据流中的移动平均值
 */
public class Solution0346 {
    class MovingAverage {
        private int size;
        private double res;
        private Queue<Integer> queue;
        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            this.size=size;
            this.res=0;
            queue=new LinkedList<>();
        }

        public double next(int val) {
            if (queue.size() < size) {
                queue.add(val);
                res=(res*(queue.size()-1)+val)/ queue.size();
            } else {
                int poll=queue.poll();
                queue.add(val);
                res=(res*size-poll+val)/size;
            }
            return res;
        }
    }

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
}
