public class Solution0088 {
    //两个有序数组可以从两个数组最小位置移动指针也可以从最大位置移动指针
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n -1;
        m--;
        n--;
        while(m >= 0 && n >= 0){
            if (nums1[m]>=nums2[n]){
                nums1[i--] = nums1[m--];
            } else {
                nums1[i--] = nums2[n--];
            }
        }
        while (n>=0){
            nums1[i--] = nums2[n--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for (Integer i : nums1){
            System.out.println(i);
        }
    }
}
