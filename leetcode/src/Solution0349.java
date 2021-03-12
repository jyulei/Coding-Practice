import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
/**
 * 349. 两个数组的交集
 */
public class Solution0349 {
    public int[] intersection1(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums1.length;i++){
            hashSet.add(nums1[i]);
        }
        for (int i = 0; i< nums2.length ; i++){
            if (hashSet.contains(nums2[i])){
                list.add(nums2[i]);
                hashSet.remove(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i<result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }


    public int[] intersection2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        List<Integer> list = new LinkedList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] == nums2[j]){
                if (!list.contains(nums1[i])) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            } else {
                j++;
            }
        }
        int[] result = new int[list.size()];
        for (int ij = 0; ij<result.length;ij++){
            result[ij] = list.get(ij);
        }
        return result;
    }
}
