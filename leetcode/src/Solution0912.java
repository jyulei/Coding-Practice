import com.sun.source.tree.IfTree;

/**
 * 912. 排序数组
 */
public class Solution0912 {
    /**
     * 选择
     * @param nums
     * @return
     */
    public static int[] sortArray(int[] nums) {
        for (int i=0;i<nums.length-1;i++){
            int min=i;
            for (int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            if (min!=i){
                nums[min]=nums[i]+nums[min];
                nums[i]=nums[min]-nums[i];
                nums[min]=nums[min]-nums[i];
            }

        }
        return nums;
    }

    /**
     * 冒泡
     * @param nums
     * @return
     */
    public static int[] sortArray2(int[] nums) {
        boolean b=true;
        for (int i=nums.length-1;i>0;i--){
            if (b==false){
                break;
            }
            b=false;
            for (int j=0;j<i;j++){
                if (nums[j]>nums[j+1]){
                    b=true;
                    swap(nums,j,j+1);
                }
            }
        }
        return nums;
    }

    /**
     * 插入
     * @param nums
     * @return
     */
    public static int[] sortArray1(int[] nums) {
        for (int i=1;i<nums.length;i++){
            int j=i;
            int tmp=nums[j];
            while (j>=1&&tmp<nums[j-1]){
                nums[j]=nums[j-1];
                j--;
            }
            nums[j]=tmp;
        }
        return nums;
    }


    /**
     * 希尔
     * @param nums
     * @return
     */
    public static int[] sortArray3(int[] nums) {
        for (int gap=nums.length/2;gap>=1;gap=gap/2){
            for (int i=0;i<gap;i++){
                for (int j=i+gap;j<nums.length;j=j+gap){
                    int tmp=nums[j];
                    int jj=j;
                    while (jj>=i+gap&&tmp<nums[jj-gap]){
                        nums[jj]=nums[jj-gap];
                        jj=jj-gap;
                    }
                    nums[jj]=tmp;
                }
            }
        }
        return nums;
    }

    /**
     * 快速
     * @param nums
     * @return
     */
    public static int[] sortArray4(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private static void quickSort(int[] nums, int start, int end) {
            if(start>=end){
                return;
            }
            int i=start,j=end;
            int pivot=nums[j];
            while (i<j){
                while (i < j && nums[i] <= pivot) {
                    i++;
                }
                if (i < j) {
                    nums[j]=nums[i];
                }
                while (i < j && nums[j] >= pivot) {
                    j--;
                }
                if (i < j) {
                    nums[i] = nums[j];
                }
            }
            nums[i]=pivot;
            quickSort(nums,start,i-1);
            quickSort(nums,i+1,end);
        }

    private static void  swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{-1,2,-8,-10};
        sortArray(nums);
        for (int i:nums){
            System.out.println(i);
        }
    }
}
