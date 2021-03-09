import java.util.LinkedList;
import java.util.List;

/**
 * 384. 打乱数组
 */
public class Solution0384 {
    int[] ori;

    public Solution0384(int[] nums) {
        this.ori = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return ori;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0;i< ori.length;i++){
            list.add(ori[i]);
        }
        int[] result = new int[ori.length];
        for (int i = 0;i< result.length;i++){
            int random = (int) (Math.random()*list.size());
            result[i] = list.get(random);
            list.remove(random);
        }
        return result;
    }
}
