import java.util.HashMap;

/**
 *  219.存在重复元素 II
 */
public class Solution0219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) {
            return false;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(nums[0],k);
        for (int i = 1; i< nums.length; i++){
            if (hashMap.containsKey(nums[i])){
                if (hashMap.get(nums[i])>=i){
                    return true;
                } else {
                    hashMap.put(nums[i],i+k);
                }
            } else {
                hashMap.put(nums[i],i+k);
            }
        }
        return false;
    }
}