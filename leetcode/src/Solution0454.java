import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 454. 四数相加 II
 */
public class Solution0454 {

    /**
     * 分组+哈希表
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums1.length;i++){
            for (int j=0;j< nums2.length;j++){
                map.put(nums1[i]+nums2[j],map.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }
        int res=0;
        for (int k=0;k<nums3.length;k++){
            for (int l=0;l< nums4.length;l++){
                int tmp=nums3[k]+nums4[l];
                if (map.get(-1 * tmp) != null) {
                    res+=map.get(-1*tmp);
                }
            }
        }
        return res;
    }

    /**
     * 超出了时间限制的垃圾方法
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public int fourSumCount1(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res=0;
        for (int i=0;i<nums1.length;i++){
            res+=threeSumCount(nums2, nums3, nums4,-1*nums1[i]);
        }
        return res;
    }

    private int threeSumCount(int[] nums2, int[] nums3, int[] nums4, int target) {
        int res = 0;
        for (int i=0;i<nums2.length;i++){
            res+=twoSumCount(nums3, nums4,target-nums2[i]);
        }
        return res;
    }

    private int twoSumCount(int[] nums3, int[] nums4, int target) {
        Arrays.sort(nums3);
        Arrays.sort(nums4);
        int res=0,i=0,j=nums4.length-1;
        while (i<nums3.length&&j>=0){
            if (nums3[i]+nums4[j]==target){
                int inum=1,jnum=1;
                while (i<nums3.length-1&&nums3[i]==nums3[i+1]){
                    inum++;
                    i++;
                }
                while (j>0&&nums4[j]==nums4[j-1]){
                    jnum++;
                    j--;
                }
                res+=inum*jnum;
                i++;
            } else if (nums3[i]+nums4[j]<target){
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
