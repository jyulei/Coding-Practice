import java.util.HashSet;

/**
 * 217. 存在重复元素
 */
public class Solution0217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet();
        for (int i = 0;i< nums.length;i++){
            if (hash.contains(nums[i])) {
                return true;
            } else {
                hash.add(nums[i]);
            }
        }
        return false;
    }
}
