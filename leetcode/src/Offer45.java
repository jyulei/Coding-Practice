import java.util.Arrays;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 */
public class Offer45 {
    public String minNumber(int[] nums) {
        String[] s=new String[nums.length];
        for (int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(x,y)->(x+y).compareTo(y+x));
        return String.join("",s);
    }

    private int swap(int a, int b) {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        return (s1+s2).compareTo(s2+s1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,8,9,7,4,5,2};
        selectionSort(arr);
        selectionSort2(arr);
    }

    public static void selectionSort(int[] arr) {
        int countI = 0;
        int countJ = 0;
        int countArr = 0;
        int minIndex;
        countI++;
        for (int i = 0; i < arr.length - 1; i++, countI++) {
            minIndex = i;
            countJ++;
            for (int j = i + 1; j < arr.length; j++, countJ++) {
                if (arr[minIndex] > arr[j]) {
                    // 记录最小值的下标
                    minIndex = j;
                }
                countArr++;
            }
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        int count = countI + countJ + countArr;
        System.out.println("selectionSort: countI = " + countI + ", countJ = " + countJ + ", countArr = " + countArr + ", count = " + count);
    }

    public static void selectionSort2(int[] arr) {
        int countI = 0;
        int countJ = 0;
        int countArr = 0;
        int minIndex, maxIndex;
        countI++;
        // i 只需要遍历一半
        for (int i = 0; i < arr.length / 2; i++, countI++) {
            minIndex = i;
            maxIndex = i;
            countJ++;
            for (int j = i + 1; j < arr.length - i; j++, countJ++) {
                if (arr[minIndex] > arr[j]) {
                    // 记录最小值的下标
                    minIndex = j;
                }
                if (arr[maxIndex] < arr[j]) {
                    // 记录最大值的下标
                    maxIndex = j;
                }
                countArr += 2;
            }
            // 如果 minIndex 和 maxIndex 都相等，那么他们必定都等于 i，且后面的所有数字都与 arr[i] 相等，此时已经排序完成
            if (minIndex == maxIndex) break;
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            // 如果最大值的下标刚好是 i，由于 arr[i] 和 arr[minIndex] 已经交换了，所以这里要更新 maxIndex 的值。
            if (maxIndex == i) maxIndex = minIndex;
            // 将最大元素交换至末尾
            int lastIndex = arr.length - 1 - i;
            temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        int count = countI + countJ + countArr;
        System.out.println("selectionSort2: countI = " + countI + ", countJ = " + countJ + ", countArr = " + countArr + ", count = " + count);
    }

}


