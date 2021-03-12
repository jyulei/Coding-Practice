import java.util.ArrayList;

/**
 * 4. 寻找两个正序数组的中位数
 */
public class Solution0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        ArrayList arrayList = new ArrayList();
        while(i<nums1.length && j< nums2.length){
            if (nums1[i]<=nums2[j]){
                arrayList.add(nums1[i]);
                i++;
            }else if(nums1[i]>nums2[j]){
                arrayList.add(nums2[j]);
                j++;
            }
        }
        if (i== nums1.length){
            while(j< nums2.length){
                arrayList.add(nums2[j]);
                j++;
            }
        }
        if (j== nums2.length){
            while(i< nums1.length){
                arrayList.add(nums1[i]);
                i++;
            }
        }
        int k = arrayList.size();
        if (k%2==1){
            int ans = (int)arrayList.get(k/2);
            return (double)ans;
        }else {
            int ans = (int)arrayList.get(k/2)+(int)arrayList.get(k/2-1);
            return ans/2.0;
        }
    }
}