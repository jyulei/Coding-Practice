import java.util.*;

/**
 * 15. 三数之和
 *
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，
 * 使得a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 */
public class Solution0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i=0;i<nums.length-2;i++){
            int j=i+1,k= nums.length-1;
            while (j<k){
                if (nums[i]+nums[j]+nums[k]==0){
                    List<Integer> list=new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    res.add(list);
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new LinkedList<>(res);
    }
}
