import java.util.HashMap;
import java.util.HashSet;

public class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        int data[]=new int[2];
        int i,j;
        for(i=0;i<nums.length;++i){
            int a=nums[i];
            for(j=i+1;j<nums.length;++j){
                if(a+nums[j]==target){
                    data[0]=i;
                    data[1]=j;
                }
            }
        }
        return data;
    }
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int value = target - nums[i];
            if (map.containsKey(value)) {
                int[] result = {map.get(value),i};
                return result;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
