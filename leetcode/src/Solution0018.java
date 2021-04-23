import java.util.*;

/**
 * 18. 四数之和
 */
public class Solution0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int l=0;l<nums.length-3;l++){
            for (int i=l+1;i<nums.length-2;i++){
                int j=i+1,k= nums.length-1;
                while (j<k){
                    if (nums[l]+nums[i]+nums[j]+nums[k]==target){
                        List<Integer> list=new LinkedList<>();
                        list.add(nums[l]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        j++;
                        res.add(list);
                    } else if (nums[l] + nums[i] + nums[j] + nums[k] > 0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return new LinkedList<>(res);
    }
}
