import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * 剑指 Offer 40. 最小的 K 个数
 */
public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(list);
        int[] res=new int[k];
        for (int i=0;i<k;i++){
            res[i]=minHeap.poll();
        }
        return res;
    }
}
