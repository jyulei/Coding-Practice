import java.util.ArrayList;
import java.util.List;

/**
 * 658. 找到 K 个最接近的元素
 */
public class Solution0658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0,right=arr.length;
        while (left+k<right){
            int lAbs= Math.abs(arr[left]-x);
            int rAbs= Math.abs(arr[right-1]-x);
            if (rAbs >= lAbs) {
                right--;
            } else {
                left++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0;i<k;i++){
            res.add(arr[left++]);
        }
        return res;
    }
}
