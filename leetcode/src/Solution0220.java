import java.util.TreeSet;

/**
 * 220. 存在重复元素 III
 */
public class Solution0220 {
    //超时间限制，不能通过
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int i,j;
        for (i=0;i<nums.length-1;i++){
            for (j=i+1;j<nums.length&&j<=i+k;j++){
                if (Math.abs((long)nums[i]-(long)nums[j])<=t){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {

        TreeSet<Long> treeSet=new TreeSet<>();
        for (int i=0;i<nums.length;i++){
            Long tmp=nums[i]*1L;
            Long min=treeSet.ceiling(tmp);
            Long max=treeSet.floor(tmp);
            if (min == null && max == null) {

            } else if (min == null) {
                if (Math.abs(max-tmp)<=t){
                    return true;
                }
            } else if (max == null) {
                if (Math.abs(min-tmp)<=t){
                    return true;
                }
            } else {
                if (Math.abs(max-tmp)<=t){
                    return true;
                }
                if (Math.abs(min-tmp)<=t){
                    return true;
                }
            }
            treeSet.add(tmp);
            if (i>=k){
                treeSet.remove(nums[i-k]*1L);
            }
        }
        return false;
    }

}
