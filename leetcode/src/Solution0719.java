import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 719. 找出第 k 小的距离对
 */
public class Solution0719 {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<nums.length-1;i++){

            int dis=Math.abs(nums[i]-nums[i+1]);
            if (priorityQueue.size()>=k){
                int top=priorityQueue.peek();
                if (dis >= top) {
                    continue;
                } else {
                    priorityQueue.add(dis);
                    priorityQueue.poll();
                }
            } else {
                priorityQueue.add(dis);
            }
        }

        return priorityQueue.poll();
    }
}
