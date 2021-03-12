import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 350.两个数组的交集 II
 * java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
 *   at line 32, Solution.intersect
 *   at line 57, __DriverSolution__.__helper__
 *   at line 87, __Driver__.main
 */
public class Solution0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        int[] a = new int[list.size()];
        for (int k = 0; k< a.length;k++){
            a[k] = list.get(k);
        }
        return a;
    }
}
